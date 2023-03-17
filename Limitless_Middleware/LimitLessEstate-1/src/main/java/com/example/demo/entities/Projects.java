package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Id;



@Entity
@Table (name = "projects")
public class Projects 
{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int project_id;
	
	@ManyToOne
	@JoinColumn(name="builder_id")
	Builder_firm_reg builder_id;
	
	@Column
	String project_name;
	@Column
	String contact_no;
	@Column
	int rera_no;
	@Column
	int total_buildings;
	@Column
	int total_flats;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column
	Date start_date;
	
	@JsonFormat(pattern = "MMM yyyy")
	@Column
	Date end_date;
	
	@ManyToOne
	@JoinColumn(name="address_id")
	Address address_id;

	public Projects() 
	{
		
	}
	
	public Projects( Builder_firm_reg builder_id, String project_name, String contact_no, int rera_no,
			int total_buildings, int total_flats, Date start_date, Date end_date, Address address_id ,int project_id) {
		super();
		this.project_id = project_id;
		this.builder_id = builder_id;
		this.project_name = project_name;
		this.contact_no = contact_no;
		this.rera_no = rera_no;
		this.total_buildings = total_buildings;
		this.total_flats = total_flats;
		this.start_date = start_date;
		this.end_date = end_date;
		this.address_id = address_id;
	}

	

	public Projects(String project_name2, String contact_no2, int rera_no2, int total_buildings2, int total_flats2,
			Date start_date2, Date end_date2, Address saveadr, Builder_firm_reg savesrc) 
	{
		
		this.builder_id = savesrc;
		this.project_name = project_name2;
		this.contact_no = contact_no2;
		this.rera_no = rera_no2;
		this.total_buildings = total_buildings2;
		this.total_flats = total_flats2;
		this.start_date = start_date2;
		this.end_date = end_date2;
		this.address_id = saveadr;
		
	}

	public Projects(int project_id)
	{
		this.project_id = project_id;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public Builder_firm_reg getBuilder_id() {
		return builder_id;
	}

	public void setBuilder_id(Builder_firm_reg builder_id) {
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

	public Address getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Address address_id) {
		this.address_id = address_id;
	}

	@Override
	public String toString() {
		return "Projects [project_id=" + project_id + ", builder_id=" + builder_id + ", project_name=" + project_name
				+ ", contact_no=" + contact_no + ", rera_no=" + rera_no + ", total_buildings=" + total_buildings
				+ ", total_flats=" + total_flats + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", address_id=" + address_id + "]";
	}

	
	
}
