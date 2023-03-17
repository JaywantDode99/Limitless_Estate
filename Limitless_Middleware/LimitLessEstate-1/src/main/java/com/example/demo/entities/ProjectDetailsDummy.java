package com.example.demo.entities;



public class ProjectDetailsDummy {
	
	String building_name;
	int total_flats;
	int type_id;
	int project_id;
	
	public ProjectDetailsDummy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProjectDetailsDummy(String building_name, int total_flats, int type_id, int project_id) {
		super();
		this.building_name = building_name;
		this.total_flats = total_flats;
		this.type_id = type_id;
		this.project_id = project_id;
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
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	
	@Override
	public String toString() {
		return "ProjectDetailsDummy [building_name=" + building_name + ", total_flats=" + total_flats + ", type_id="
				+ type_id + ", project_id=" + project_id + "]";
	}
	
	
}
