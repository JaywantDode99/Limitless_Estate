package com.example.demo.entities;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table (name = "favourites")
public class Favourite 
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int favourite_id;
	
//	@JsonFormat(pattern = "yyyy-MM-dd")
//	@Column
//	Date date;
	
	@OneToOne
	@JoinColumn(name="login_id")
	User_details login_id;
	
	@ManyToOne
	@JoinColumn(name="project_id")
	Projects project_id;

	public Favourite() {
		super();
	}

	

	public Favourite( User_details login_id, Projects project_id) {
		super();
		
		this.login_id = login_id;
		this.project_id = project_id;
	}



	public int getFavourite_id() {
		return favourite_id;
	}

	public void setFavourite_id(int favourite_id) {
		this.favourite_id = favourite_id;
	}

	

	public User_details getLogin_id() {
		return login_id;
	}

	public void setLogin_id(User_details login_id) {
		this.login_id = login_id;
	}

	public Projects getProject_id() {
		return project_id;
	}

	public void setProject_id(Projects project_id) {
		this.project_id = project_id;
	}

	@Override
	public String toString() {
		return "Favourite [favourite_id=" + favourite_id + ", login_id=" + login_id + ", project_id="
				+ project_id + "]";
	}

	
	
	
}
