package com.example.demo.entities;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;




public class Favouritedummy 
{
	
	int login_id,project_id;
	//Date date;
	
	

	public Favouritedummy() {
		super();
	}



	public int getLogin_id() {
		return login_id;
	}



	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}



	public int getProject_id() {
		return project_id;
	}



	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	







	



	@Override
	public String toString() {
		return "Favouritedummy [login_id=" + login_id + ", project_id=" + project_id + "]";
	}

	
	
	
	
}
