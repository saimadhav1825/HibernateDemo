package com.SaiJava.HibernateDemo;

import javax.persistence.Embeddable;

@Embeddable
public class Alienaname {
	String fname;
	String mname;
	String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Alienaname [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
	

}
