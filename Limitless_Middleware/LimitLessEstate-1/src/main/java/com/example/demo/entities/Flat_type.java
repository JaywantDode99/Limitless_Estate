package com.example.demo.entities;
import javax.persistence.*;

@Entity
@Table (name = "flat_types")
public class Flat_type
{
	@Id
	int type_id;
	
	@Column
	String type_name;

	public Flat_type() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flat_type(int type_id, String type_name) {
		super();
		this.type_id = type_id;
		this.type_name = type_name;
	}

	public Flat_type(int type_id) 
	{
		this.type_id = type_id;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	@Override
	public String toString() {
		return "Flat_types [type_id=" + type_id + ", type_name=" + type_name + "]";
	}
	
}
