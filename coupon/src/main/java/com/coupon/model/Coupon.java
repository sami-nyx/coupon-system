package com.coupon.model;


import java.sql.Date;

import com.coupon.types.CouponType;

public class Coupon {

	private long id;
	private String Title;
	private Date StartDate;
	private Date EndtDate;
	private int Amount;
	private CouponType Type;
	private String Message;
	private Double Price;
	private String Image;

	public Coupon(long id, String Title, Date StartDate, Date EndtDate, int Amount, CouponType Type, String Message,
			Double Price, String Image) {
		this.id = id;
		this.Title = Title;
		this.StartDate = StartDate;
		this.EndtDate = EndtDate;
		this.Amount = Amount;
		this.Type = Type;
		this.Message = Message;
		this.Price = Price;
		this.Image = Image;

	}

	public Coupon() {
		
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	@Override
	public String toString() {
		return " id -" + id + " |Title- " + Title + " |StartDate -" + StartDate + "| EndtDate -" + EndtDate
				+ "| Amount - " + Amount + " |Type - " + Type + " |Message -" + Message + " |Price - " + Price
				+ " | Image -" + Image + '\n';
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndtDate() {
		return EndtDate;
	}

	public void setEndtDate(Date endtDate) {
		EndtDate = endtDate;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public CouponType getType() {
		return Type;
	}

	public void setType(CouponType couponType) {
		Type = couponType;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

}
