package com.example.demo.entities;

public class SiteVisitDummy 
{
	int customer_login_id;
	int executive_login_id;
	int project_id;
	
	Boolean requeststatus;
	
	String customer_feedback;
	
	String executive_feedback;

	Boolean visitedstatus;

	public int getCustomer_login_id() {
		return customer_login_id;
	}

	public void setCustomer_login_id(int customer_login_id) {
		this.customer_login_id = customer_login_id;
	}

	public int getExecutive_login_id() {
		return executive_login_id;
	}

	public void setExecutive_login_id(int executive_login_id) {
		this.executive_login_id = executive_login_id;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
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

	public Boolean getVisitedstatus() {
		return visitedstatus;
	}

	public void setVisitedstatus(Boolean visitedstatus) {
		this.visitedstatus = visitedstatus;
	}
	
	
	
}
