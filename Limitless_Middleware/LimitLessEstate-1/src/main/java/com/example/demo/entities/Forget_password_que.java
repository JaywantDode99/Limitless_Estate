package com.example.demo.entities;


import javax.persistence.*;


@Entity
@Table (name = "forget_password_que")
public class Forget_password_que 
{
	
	@Id
	int forget_pwd_que_id ;
	
	@Column 
	String question;

	public Forget_password_que() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Forget_password_que(int forget_pwd_que_id, String question) {
		super();
		this.forget_pwd_que_id = forget_pwd_que_id;
		this.question = question;
	}

	public Forget_password_que(int security_que) 
	{
		this.forget_pwd_que_id = security_que;
	}

	public int getForget_pwd_que_id() {
		return forget_pwd_que_id;
	}

	public void setForget_pwd_que_id(int forget_pwd_que_id) {
		this.forget_pwd_que_id = forget_pwd_que_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Forget_password_que [forget_pwd_que_id=" + forget_pwd_que_id + ", question=" + question + "]";
	}
	
	

}
