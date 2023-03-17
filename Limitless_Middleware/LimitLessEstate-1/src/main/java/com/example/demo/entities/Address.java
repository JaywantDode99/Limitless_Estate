package com.example.demo.entities;
import javax.persistence.*;


@Entity
@Table (name = "address")
public class Address 
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int address_id;
	
	@Column
	String house_no ;
	
	@Column
	String building_name;
	
	@Column
	String area ;
	
	@Column
	String city ;
	
	@Column
	int pincode;
	
	@Column
	String regby ;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int address_id,String house_no, String building_name, String area, String city, int pincode,String regBy) {
		super();
		this.address_id=address_id;
		this.house_no = house_no;
		this.building_name = building_name;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.regby=regBy ;
	}
	
	public Address(String house_no, String building_name, String area, String city, int pincode,String regBy) {
		super();
		
		this.house_no = house_no;
		this.building_name = building_name;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.regby=regBy ;
	}
	

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	
	
	public String getRegBy() {
		return regby;
	}

	public void setRegBy(String regBy) {
		this.regby = regBy;
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
		return "Address [address_id=" + address_id + ", house_no=" + house_no + ", building_name=" + building_name
				+ ", area=" + area + ", city=" + city + ", pincode=" + pincode + ", regBy=" + regby + "]";
	}

	
	
}
