package com.example.demo.entities;



public class Builder_firm_regDummy 
{
	

	String firm_name;
	
	String reg_no;
	
	
	int login_id;

	public Builder_firm_regDummy() {
		super();
	}
	
	public Builder_firm_regDummy(String firm_name, String reg_no, int loginid) {
		super();
		this.firm_name = firm_name;
		this.reg_no = reg_no;
		this.login_id = loginid;
	}


	public String getFirm_name() {
		return firm_name;
	}


	public void setFirm_name(String firm_name) {
		this.firm_name = firm_name;
	}



	public String getReg_no() {
		return reg_no;
	}



	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}


	public int getLogin_id() {
		return login_id;
	}



	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}



	@Override
	public String toString() {
		return "Builder_firm_regDummy [firm_name=" + firm_name + ", reg_no=" + reg_no + ", login_id=" + login_id + "]";
	}



	
	
}
