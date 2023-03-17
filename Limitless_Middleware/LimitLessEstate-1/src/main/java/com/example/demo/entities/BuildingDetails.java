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
@Table (name = "buildings")
public class BuildingDetails {
		
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int building_id;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	Flat_category category_id;
	
	@Column
	int total_flats;
	
	@Column
	String price;
	
	
	@ManyToOne
	@JoinColumn(name="project_details_id")
	ProjectDetails project_details_id;


	public BuildingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BuildingDetails(int building_id, Flat_category category_id, int total_flats, String price,
			ProjectDetails project_details_id) {
		super();
		this.building_id = building_id;
		this.category_id = category_id;
		this.total_flats = total_flats;
		this.price = price;
		this.project_details_id = project_details_id;
	}


	public BuildingDetails( Flat_category category_id, int total_flats, String price,
			ProjectDetails project_details_id) {
		super();
		
		this.category_id = category_id;
		this.total_flats = total_flats;
		this.price = price;
		this.project_details_id = project_details_id;
	}


	public int getBuilding_id() {
		return building_id;
	}


	public void setBuilding_id(int building_id) {
		this.building_id = building_id;
	}


	public Flat_category getCategory_id() {
		return category_id;
	}


	public void setCategory_id(Flat_category category_id) {
		this.category_id = category_id;
	}


	public int getTotal_flats() {
		return total_flats;
	}


	public void setTotal_flats(int total_flats) {
		this.total_flats = total_flats;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public ProjectDetails getProject_details_id() {
		return project_details_id;
	}


	public void setProject_details_id(ProjectDetails project_details_id) {
		this.project_details_id = project_details_id;
	}


	@Override
	public String toString() {
		return "BuildingDetails [building_id=" + building_id + ", category_id=" + category_id + ", total_flats="
				+ total_flats + ", price=" + price + ", project_details_id=" + project_details_id + "]";
	}

	
	
}
