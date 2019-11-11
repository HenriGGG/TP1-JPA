package fr.efrei.TP1JPA;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Tp1JpaApplication {
	
	private static final Logger log = LoggerFactory.getLogger(Tp1JpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Tp1JpaApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(PersonRepository repository) {
		return (args) -> {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date datebegin = dateFormat.parse("2018-10-09");
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date dateend = dateFormat.parse("2018-10-15");
			
			Car audi = new Car(111, 5);
			Rent rent1 = new Rent(1, datebegin, dateend);
			Person yui = new Person(1, "Yuian");
			rent1.getVehicule(audi);
			rent1.getPersons(yui);
			yui.setRentNumbers(rent1);
			
			repository.save(yui);
			
			log.info("Persons found with findAll():");
			for (Person person : repository.findAll()) {
				log.info(person.toString());
			}
		};
	}
}
