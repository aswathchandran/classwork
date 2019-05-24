package com.pack;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Category")
public class Category {
	@Id
	private int catid;
	private String name;
	@ManyToMany(targetEntity=Items.class,cascade=CascadeType.ALL)
	@JoinTable(name="category_items",joinColumns=@JoinColumn
	(name="cat_id_fk",referencedColumnName="catid"),
	inverseJoinColumns=@JoinColumn
	(name="item_id_fk",referencedColumnName="itemid")
	)
	private Set items;
	
	
	
	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
