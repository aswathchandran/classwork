package com.pack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="reg_emp")
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
