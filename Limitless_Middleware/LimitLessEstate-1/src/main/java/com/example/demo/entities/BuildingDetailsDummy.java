package com.example.demo.entities;



public class BuildingDetailsDummy {
	
	
	int category_id;
	int total_flats;
	String price;
	int project_details_id;
	
	public BuildingDetailsDummy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BuildingDetailsDummy(int category_id, int total_flats, String price, int project_details_id) {
		super();
		this.category_id = category_id;
		this.total_flats = total_flats;
		this.price = price;
		this.project_details_id = project_details_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
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

	public int getProject_details_id() {
		return project_details_id;
	}

	public void setProject_details_id(int project_details_id) {
		this.project_details_id = project_details_id;
	}

	@Override
	public String toString() {
		return "BuildingDetailsDummy [category_id=" + category_id + ", total_flats=" + total_flats + ", price=" + price
				+ ", project_details_id=" + project_details_id + "]";
	}
	
	
	
}
