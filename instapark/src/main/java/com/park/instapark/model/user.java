package com.park.instapark.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String fullname;
	private long phoneNumber;
	private String address;
	private String email;
	private String password;
	private boolean hostflag;
	
	
	public boolean isHostflag() {
		return hostflag;
	}
	public void setHostflag(boolean hostflag) {
		this.hostflag = hostflag;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public user(int userid, String fullname, long phoneNumber, String address, String email, String password,
			boolean hostflag) {
		super();
		this.userid = userid;
		this.fullname = fullname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.password = password;
		this.hostflag = hostflag;
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "user [userid=" + userid + ", fullname=" + fullname + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", email=" + email + ", password=" + password + ", hostflag=" + hostflag + "]";
	}
	
	
	
	

}
