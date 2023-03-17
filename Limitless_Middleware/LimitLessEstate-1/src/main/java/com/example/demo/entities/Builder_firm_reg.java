package com.example.demo.entities;
import java.util.List;

import javax.persistence.*;


@Entity
@Table (name = "builder_reg")

public class Builder_firm_reg 
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int builder_id;
	
	@Column
	String firm_name ;
	
	@Column
	String reg_no;
	
	@OneToOne
	@JoinColumn(name="login_id")
	User_details login_id;
	
	

	public Builder_firm_reg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Builder_firm_reg(int builder_id, String firm_name, String reg_no, User_details login_id) {
		super();
		this.builder_id = builder_id;
		this.firm_name = firm_name;
		this.reg_no = reg_no;
		this.login_id = login_id;
	}
	
	public Builder_firm_reg(String firm_name, String reg_no, User_details login_id) {
		super();
		
		this.firm_name = firm_name;
		this.reg_no = reg_no;
		this.login_id = login_id;
	}


	public Builder_firm_reg(int builder_id) {
		this.builder_id = builder_id;
	}

	public int getBuilder_id() {
		return builder_id;
	}

	public void setBuilder_id(int builder_id) {
		this.builder_id = builder_id;
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

	public User_details getLogin_id() {
		return login_id;
	}

	public void setLogin_id(User_details login_id) {
		this.login_id = login_id;
	}

	@Override
	public String toString() {
		return "Builder_firm_reg [builder_id=" + builder_id + ", firm_name=" + firm_name + ", reg_no=" + reg_no
				+ ", login_id=" + login_id + "]";
	}
	
	
}
