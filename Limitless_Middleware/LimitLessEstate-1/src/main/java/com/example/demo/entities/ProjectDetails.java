package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table (name = "project_details")
public class ProjectDetails 
{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int project_details_id;
	
	@Column
	String building_name;
	
	@Column
	int total_flats;
	
	@ManyToOne
	@JoinColumn(name="type_id")
	Flat_type type_id;
	
	@ManyToOne
	@JoinColumn(name="project_id")
	Projects project_id;

	public ProjectDetails() {
		super();
	}

	public ProjectDetails(int project_details_id, String building_name, int total_flats, Flat_type type_id,
			Projects project_id) {
		super();
		this.project_details_id = project_details_id;
		this.building_name = building_name;
		this.total_flats = total_flats;
		this.type_id = type_id;
		this.project_id = project_id;
	}

	public ProjectDetails(String building_name2, int total_flats2, Flat_type type_id2, Projects project_id2) 
	{
		this.building_name = building_name2;
		this.total_flats = total_flats2;
		this.type_id = type_id2;
		this.project_id = project_id2;
	}

	public ProjectDetails(int project_details_id) 
	{
		this.project_details_id = project_details_id;
	}

	public int getProject_details_id() {
		return project_details_id;
	}

	public void setProject_details_id(int project_details_id) {
		this.project_details_id = project_details_id;
	}

	public String getBuilding_name() {
		return building_name;
	}

	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}

	public int getTotal_flats() {
		return total_flats;
	}

	public void setTotal_flats(int total_flats) {
		this.total_flats = total_flats;
	}

	public Flat_type getType_id() {
		return type_id;
	}

	public void setType_id(Flat_type type_id) {
		this.type_id = type_id;
	}

	public Projects getProject_id() {
		return project_id;
	}

	public void setProject_id(Projects project_id) {
		this.project_id = project_id;
	}

	@Override
	public String toString() {
		return "ProjectDetails [project_details_id=" + project_details_id + ", building_name=" + building_name
				+ ", total_flats=" + total_flats + ", type_id=" + type_id + ", project_id=" + project_id + "]";
	}
	
	
	
}
