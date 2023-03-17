package com.example.demo.entities;

import java.util.Date;

public class ProjectsDummy {
	int builder_id;
	String project_name;
	String contact_no;
	int rera_no;
	int total_buildings;
	int total_flats;
	Date start_date;
	Date end_date;
    String house_no ;
	String building_name;
	String area ;
	String city ;	
	int pincode;
	String regBy;
	
	public ProjectsDummy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjectsDummy(int builder_id, String project_name, String contact_no, int rera_no, int total_buildings,
			int total_flats, Date start_date, Date end_date, String house_no, String building_name, String area,
			String city, int pincode,String regBy) {
		super();
		this.builder_id = builder_id;
		this.project_name = project_name;
		this.contact_no = contact_no;
		this.rera_no = rera_no;
		this.total_buildings = total_buildings;
		this.total_flats = total_flats;
		this.start_date = start_date;
		this.end_date = end_date;
		this.house_no = house_no;
		this.building_name = building_name;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.regBy=regBy;
	}
	

	public String getRegBy() {
		return regBy;
	}
	public void setRegBy(String regBy) {
		this.regBy = regBy;
	}
	public int getBuilder_id() {
		return builder_id;
	}
	public void setBuilder_id(int builder_id) {
		this.builder_id = builder_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public int getRera_no() {
		return rera_no;
	}
	public void setRera_no(int rera_no) {
		this.rera_no = rera_no;
	}
	public int getTotal_buildings() {
		return total_buildings;
	}
	public void setTotal_buildings(int total_buildings) {
		this.total_buildings = total_buildings;
	}
	public int getTotal_flats() {
		return total_flats;
	}
	public void setTotal_flats(int total_flats) {
		this.total_flats = total_flats;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public String getBuilding_name() {
		return building_name;
	}
	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "ProjectsDummy [builder_id=" + builder_id + ", project_name=" + project_name + ", contact_no="
				+ contact_no + ", rera_no=" + rera_no + ", total_buildings=" + total_buildings + ", total_flats="
				+ total_flats + ", start_date=" + start_date + ", end_date=" + end_date + ", house_no=" + house_no
				+ ", building_name=" + building_name + ", area=" + area + ", city=" + city + ", pincode=" + pincode
				+ "]";
	}
	
	
}
