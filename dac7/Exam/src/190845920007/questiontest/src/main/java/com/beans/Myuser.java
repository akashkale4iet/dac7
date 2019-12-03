package com.beans;

import org.springframework.stereotype.Component;

@Component
public class Myuser {
	
	
	
	private String fname;
	private String lname;
	private String cno;
	private String email;
	private String bdate;
	private String city;
	public Myuser() {
		super();
	}
	public Myuser(String fname, String lname, String cno, String email, String bdate, String city) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.cno = cno;
		this.email = email;
		this.bdate = bdate;
		this.city = city;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Myuser [fname=" + fname + ", lname=" + lname + ", cno=" + cno + ", email=" + email + ", bdate=" + bdate
				+ ", city=" + city + "]";
	}
	
	
}
