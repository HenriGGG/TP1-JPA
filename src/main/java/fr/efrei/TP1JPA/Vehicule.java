package fr.efrei.TP1JPA;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Vehicule {
	
	@Id
	private int plateNumber ;
	private Arratlist<Rent> RentNumbers = new Arraylist<Rent> ();
	
	public Vehicule () {
	}
	
	public Vehicule (int Number) {
		this.plateNumber;
	}
	

	public int getplateNumber() {
		return plateNumber;
	}
	
	public void setplateNumber(int Number) {
		this.plateNumber = Number;
	}
	
	@OneToMany(mappedBy="Rents", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	public Arraylist<Rent> getRentNumbers(){
		return RentNumbers;
	}
	
	public void setRentNumbers(Arraylist<Rent> Rents) {
		this.RentNumbers = Rents;
	}

	
	@Override
	public String toString() {
		return "Vehicule [plateNumber is " + plateNumber + "]";
	}
	
}