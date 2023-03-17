package com.example.demo.entities;
import javax.persistence.*;

@Entity
@Table (name = "source")
public class Source
{
	@Id
	int source_id;
	
	@Column
	String source_type;

	public Source() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Source(int source_id, String source_type) {
		super();
		this.source_id = source_id;
		this.source_type = source_type;
	}
	
	public Source(int source_id2) 
	{
		this.source_id = source_id;
	}

	public int getSource_id() {
		return source_id;
	}

	public void setSource_id(int source_id) {
		this.source_id = source_id;
	}

	public String getSource_type() {
		return source_type;
	}

	public void setSource_type(String source_type) {
		this.source_type = source_type;
	}

	@Override
	public String toString() {
		return "Source [source_id=" + source_id + ", source_type=" + source_type + "]";
	}
	
	

}
