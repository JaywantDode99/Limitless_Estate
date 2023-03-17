package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table (name = "site_visits")
public class Site_visit 
{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int site_visit_id;
	
	@ManyToOne
	@JoinColumn(name="customer_login_id")
	User_details customer_login_id;
		
	@ManyToOne
	@JoinColumn(name="executive_login_id")
	User_details executive_login_id;
	
	@Column
	Boolean requeststatus;
	
	@Column
	String customer_feedback;
	
	@Column
	String executive_feedback;
	
	@OneToOne
	@JoinColumn(name="project_id")
	Projects project_id;
	
	@Column
	Boolean visitedstatus;

	public Site_visit() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Site_visit(User_details customer_login_id, Projects project_id,boolean i) {
		super();
		this.customer_login_id = customer_login_id;
		this.project_id = project_id;
		this.requeststatus =i;
	}


	public Site_visit(int site_visit_id, User_details customer_login_id, User_details executive_login_id,
			Boolean requeststatus, String customer_feedback, String executive_feedback, Projects project_id,
			Boolean visitedstatus) {
		super();
		this.site_visit_id = site_visit_id;
		this.customer_login_id = customer_login_id;
		this.executive_login_id = executive_login_id;
		this.requeststatus = requeststatus;
		this.customer_feedback = customer_feedback;
		this.executive_feedback = executive_feedback;
		this.project_id = project_id;
		this.visitedstatus = visitedstatus;
	}

	


	


	public int getSite_visit_id() {
		return site_visit_id;
	}

	public void setSite_visit_id(int site_visit_id) {
		this.site_visit_id = site_visit_id;
	}

	public User_details getCustomer_login_id() {
		return customer_login_id;
	}

	public void setCustomer_login_id(User_details customer_login_id) {
		this.customer_login_id = customer_login_id;
	}

	public User_details getExecutive_login_id() {
		return executive_login_id;
	}

	public void setExecutive_login_id(User_details executive_login_id) {
		this.executive_login_id = executive_login_id;
	}

	public Boolean getRequeststatus() {
		return requeststatus;
	}

	public void setRequeststatus(Boolean requeststatus) {
		this.requeststatus = requeststatus;
	}

	public String getCustomer_feedback() {
		return customer_feedback;
	}

	public void setCustomer_feedback(String customer_feedback) {
		this.customer_feedback = customer_feedback;
	}

	public String getExecutive_feedback() {
		return executive_feedback;
	}

	public void setExecutive_feedback(String executive_feedback) {
		this.executive_feedback = executive_feedback;
	}

	public Projects getProject_id() {
		return project_id;
	}

	public void setProject_id(Projects project_id) {
		this.project_id = project_id;
	}

	public Boolean getVisitedstatus() {
		return visitedstatus;
	}

	public void setVisitedstatus(Boolean visitedstatus) {
		this.visitedstatus = visitedstatus;
	}

	@Override
	public String toString() {
		return "Site_visit [site_visit_id=" + site_visit_id + ", customer_login_id=" + customer_login_id
				+ ", executive_login_id=" + executive_login_id + ", requeststatus=" + requeststatus
				+ ", customer_feedback=" + customer_feedback + ", executive_feedback=" + executive_feedback
				+ ", project_id=" + project_id + ", visitedstatus=" + visitedstatus + "]";
	}

	
}
