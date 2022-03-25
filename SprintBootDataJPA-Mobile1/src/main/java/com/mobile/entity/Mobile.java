package com.mobile.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


// Entity Annotation
@Entity
@Table(name="mobiledetails")

// Mobile Class
public class Mobile {
	
	// Mobile Details 
	
	
	private String mobileName;
	private String mobileTYPE;
	private int mobilePrice;
	private int mobileWarenty;
	
	//Id Annotaion
	@Id
	private int mobileIMEINumber;
	
	public String getMobileName() {
		return mobileName;
	}
	
	
	// Getter and Setters 
	
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileTYPE() {
		return mobileTYPE;
	}
	public void setMobileTYPE(String mobileTYPE) {
		this.mobileTYPE = mobileTYPE;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public int getMobileWarenty() {
		return mobileWarenty;
	}
	public void setMobileWarenty(int mobileWarenty) {
		this.mobileWarenty = mobileWarenty;
	}
	public int getMobileIMEINumber() {
		return mobileIMEINumber;
	}
	public void setMobileIMEINumber(int mobileIMEINumber) {
		this.mobileIMEINumber = mobileIMEINumber;
	}
	
	
	// Default Constructor 
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	// Param Constructor 
	
	public Mobile(String mobileName, String mobileTYPE, int mobilePrice, int mobileWarenty, int mobileIMEINumber) {
		super();
		this.mobileName = mobileName;
		this.mobileTYPE = mobileTYPE;
		this.mobilePrice = mobilePrice;
		this.mobileWarenty = mobileWarenty;
		this.mobileIMEINumber = mobileIMEINumber;
	}
	
	
	// To String Method 
	
	@Override
	public String toString() {
		return "Mobile [mobileName=" + mobileName + ", mobileTYPE=" + mobileTYPE + ", mobilePrice=" + mobilePrice
				+ ", mobileWarenty=" + mobileWarenty + ", mobileIMEINumber=" + mobileIMEINumber + "]";
	}
	
	
	

}
