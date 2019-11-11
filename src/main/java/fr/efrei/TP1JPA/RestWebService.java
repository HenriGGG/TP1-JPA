package fr.efrei.TP1JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWebService {

	PersonRepository personRepository;

	@Autowired
	public RestWebService(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}
	
	@GetMapping("/PersonRents")
	public Iterable<person> getPersons(){
		return personRepository.findAll();
	}
	
	
}
