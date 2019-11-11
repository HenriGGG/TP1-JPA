package fr.efrei.TP1JPA;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule{
	private float maxTon;
	
	public Van() {
	}
	
	public Van(int plateNumber , float maxTon) {
		super(plateNumber);
		this.maxTon= maxTon;
	}
	
	public float getmaxTon() {
		return maxTon;
	}
	
	public void setmaxTon(float maxTon) {
		this.maxTon;
	}
}