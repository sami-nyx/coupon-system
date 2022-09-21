package com.coupon.model;


import java.util.ArrayList;

public class Company {

	private long id;
	private String compName;
	private String password;
	private String email;
	private ArrayList<Coupon> Coupons;

	public Company(long id, String compName, String email) {
		this.id = id;
		this.compName = compName;
		this.email = email;

	}

	public Company() {
		
	}
	@Override
	public String toString() {

		return "id = " + id + " | name : " + compName + " | password : " + password + " | email : " + email + '\n';
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Coupon> getCoupons() {
		return Coupons;
	}

	public void setCoupons(ArrayList<Coupon> coupons) {
		Coupons = coupons;
	}

}
