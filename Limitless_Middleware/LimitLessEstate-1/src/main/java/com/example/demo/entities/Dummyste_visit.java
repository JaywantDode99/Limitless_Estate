package com.example.demo.entities;
import javax.persistence.*;



public class Dummyste_visit 
{
	int project_id,customer_login_id;

	public Dummyste_visit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dummyste_visit(int project_id, int customer_login_id) {
		super();
		this.project_id = project_id;
		this.customer_login_id = customer_login_id;
	}

	@Override
	public String toString() {
		return "Dummyste_visit [project_id=" + project_id + ", customer_login_id=" + customer_login_id + "]";
	}
	
	
	
	
}
