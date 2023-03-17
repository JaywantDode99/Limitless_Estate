package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table (name = "user_details")
public class User_details 
{
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int login_id;
	
	@Column
	String first_name;
	
	@Column
	String last_name;
	
	@Column
	String mobile_no;
	
	@Column
	String email_id;

	@Column
	String password;
	
	@ManyToOne 
	@JoinColumn(name ="role_id")
	Role role_id;
	
	
	@OneToOne
	@JoinColumn(name="address_id")
	Address address_id;
	
	@Column
	Boolean status;
	
	@ManyToOne 
	@JoinColumn(name ="source_id")
	Source source_id;
	
	@ManyToOne 
	@JoinColumn(name ="forget_pwd_que_id")
	Forget_password_que forget_pwd_que_id;
	
	@Column
	String answer;
	
	

	public User_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_details(int login_id, String first_name, String last_name, String mobile_no, String email_id,
			String password, Role role_id, Address address_id, Boolean status, Source source_id,
			Forget_password_que forget_pwd_que_id, String answer) {
		super();
		this.login_id = login_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
		this.password = password;
		this.role_id = role_id;
		this.address_id = address_id;
		this.status = status;
		this.source_id = source_id;
		this.forget_pwd_que_id = forget_pwd_que_id;
		this.answer = answer;
	}



	public User_details( String first_name, String last_name, String mobile_no, String email_id,
			String password, Role role_id,Boolean status,  Source source_id,
			Forget_password_que forget_pwd_que_id, String answer, Address address_id) {
		super();
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
		this.password = password;
		this.role_id = role_id;
		this.address_id = address_id;
		this.status = status;
		this.source_id = source_id;
		this.forget_pwd_que_id = forget_pwd_que_id;
		this.answer = answer;
	}

	
	



	public User_details(int login_id) 
	{
		this.login_id=login_id;
	}

	public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
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



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public String getMobile_no() {
		return mobile_no;
	}



	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
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



	public Role getRole_id() {
		return role_id;
	}



	public void setRole_id(Role role_id) {
		this.role_id = role_id;
	}



	public Address getAddress_id() {
		return address_id;
	}



	public void setAddress_id(Address address_id) {
		this.address_id = address_id;
	}



	public Boolean getStatus() {
		return status;
	}



	public void setStatus(Boolean status) {
		this.status = status;
	}



	public Source getSource_id() {
		return source_id;
	}



	public void setSource_id(Source source_id) {
		this.source_id = source_id;
	}



	public Forget_password_que getForget_pwd_que_id() {
		return forget_pwd_que_id;
	}



	public void setForget_pwd_que_id(Forget_password_que forget_pwd_que_id) {
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
		return "User_details [login_id=" + login_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", mobile_no=" + mobile_no + ", email_id=" + email_id + ", password=" + password + ", role_id="
				+ role_id + ", address_id=" + address_id + ", status=" + status + ", source_id=" + source_id
				+ ", forget_pwd_que_id=" + forget_pwd_que_id + ", answer=" + answer + "]";
	}
	
	

	
	

}
