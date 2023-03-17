package com.example.demo.entities;

import javax.persistence.*;



@Entity
@Table (name = "roles")
public class Role 
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int role_id;
	
	@Column
	String role_name ;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int role_id, String role_name) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
	}
	
	

	public Role(int role_id) 
	{
		this.role_id = role_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_name=" + role_name + "]";
	}


}
