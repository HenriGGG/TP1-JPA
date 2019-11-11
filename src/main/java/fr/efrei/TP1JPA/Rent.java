package fr.efrei.TP1JPA;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Rent {
	@Id
	private int NoRent;
	
	private java.sql.Date beginDate;
	private java.sql.Date endDate;
	private Vehicule vehicule;
	private Person person;

	public Rent () {
	}
	
	public Rent (int no , java.sql.Date begin , java.sql.Date end) {
		this.NoRent = no;
		this.beginDate = begin;
		this.endDate = end;
	}
	
	@OneToOne
	public Vehicule getVehicule() {
		return vehicule;
	}
	
	public void setVehicule(Vehicule vehicule) {
		this.vehicule=vehicule;
	}
	
	@OneToOne
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public java.sql.Date getbeginDate(){
		return beginDate;
	}
	
	public void setbeginDate(java.sql.Date begin) {
		this.beginDate = begin;
	}
	
	public java.sql.Date getendDate(){
		return endDate;
	}
	
	public void setbeginDate(java.sql.Date end) {
		this.endDate = end;
	}
	
}