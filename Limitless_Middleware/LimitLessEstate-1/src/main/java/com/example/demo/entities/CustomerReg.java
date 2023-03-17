package com.example.demo.entities;


public class CustomerReg 
{
	
	String first_name;
	
	String last_name;
	
	String mobile_no;
	
	int role_id;
	
	String email_id;

	String password;

	String house_no ;
	
	String building_name;
	
	String area ;
	
	String city ;
	
	int pincode;
	
	Boolean status;
	
	int source_id;
	
	int forget_pwd_que_id;
	
	String answer;
	
	String regBy;

	public CustomerReg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerReg(String first_name, String last_name, String mobile_no, int role_id, String email_id,
			String password, String house_no, String building_name, String area, String city, int pincode,
			Boolean status, int source_id, int forget_pwd_que_id, String answer,String regBy ) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_no = mobile_no;
		this.role_id = role_id;
		this.email_id = email_id;
		this.password = password;
		this.house_no = house_no;
		this.building_name = building_name;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.status = status;
		this.source_id = source_id;
		this.forget_pwd_que_id = forget_pwd_que_id;
		this.answer = answer;
		this.regBy=regBy;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}
	
	

	public String getRegBy() {
		return regBy;
	}

	public void setRegBy(String regBy) {
		this.regBy = regBy;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public int getSource_id() {
		return source_id;
	}

	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}

	public int getforget_pwd_que_id() {
		return forget_pwd_que_id;
	}

	public void setforget_pwd_que_id(int forget_pwd_que_id) {
		this.forget_pwd_que_id = forget_pwd_que_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "CustomerReg [first_name=" + first_name + ", last_name=" + last_name + ", mobile_no=" + mobile_no
				+ ", role_id=" + role_id + ", email_id=" + email_id + ", password=" + password + ", house_no="
				+ house_no + ", building_name=" + building_name + ", area=" + area + ", city=" + city + ", pincode="
				+ pincode + ", status=" + status + ", source_id=" + source_id + ", forget_pwd_que_id=" + forget_pwd_que_id
				+ ", answer=" + answer + "]";
	}
	
	
}
