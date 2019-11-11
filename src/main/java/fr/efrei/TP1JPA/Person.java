package fr.efrei.TP1JPA;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	private int id;
	private String name;
	private Arratlist<Rent> RentNumbers = new Arraylist<Rent> ();
	
	public Person() {
		super();
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@OneToMany(mappedBy="PersonRents", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	public Arraylist<Rent> getRentNumbers(){
		return RentNumbers;
	}
	
	public void setRentNumbers(Arraylist<Rent> Rents) {
		this.RentNumbers = Rents;
	}

	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [His/Her name is " + name + "]";
	}
	

}
	