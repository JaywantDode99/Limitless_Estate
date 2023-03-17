package com.example.demo.entities;
import javax.persistence.*;

@Entity
@Table (name = "flat_categories")
public class Flat_category
{
	@Id
	int category_id;
	
	@Column
	String category_name;

	public Flat_category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flat_category(int category_id, String category_name) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
	}

	public Flat_category(int category_id) 
	{
		this.category_id = category_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	@Override
	public String toString() {
		return "Flat_categories [Category_id=" + category_id + ", Category_name=" + category_name + "]";
	}

}
