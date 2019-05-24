package com.pack;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="emp701")
@PrimaryKeyJoinColumn(name="id")
public class RegularEmployee extends Employee {
	private float salery;
	private int bonus;
	
	
	public float getSalery() {
		return salery;
	}
	public void setSalery(float salery) {
		this.salery = salery;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	

}
