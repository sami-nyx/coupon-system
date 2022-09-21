package com.coupon.model;


import java.util.ArrayList;

public class Customer {

	private long id;
	private String custName;
	private String password;

    private ArrayList<Coupon> Coupons; 
    public Customer( long id, String custName, String password) {
    	this.id=id;
    	this.custName=custName;
    	this.password=password;
	}
    
    public Customer() {
    	
    }
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return " cust-id = "+id+" cust-Name = "+custName+" cust-Password = "+password+'\n';
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<Coupon> getCoupons() {
		return Coupons;
	}
	public void setCoupons(ArrayList<Coupon> coupons) {
		Coupons = coupons;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCustName() {
	
		return custName;
	}
	
	
}
