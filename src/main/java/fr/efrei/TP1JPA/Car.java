package fr.efrei.TP1JPA;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicule{
	private int numberOfSeats;
	
	public Car(){
	}
	
	public Car(int plateNumber , int numSeats) {
		super(plateNumber);
		this.numberOfSeats = numSeats ;
	}
	
	public int getnumberOfSeats() {
		return numberOfSeats;
	}
	
	public void setnumberOfSeats(int numSeats) {
		this.numberOfSeats;
	}
}