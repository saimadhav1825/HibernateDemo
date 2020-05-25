package com.SaiJava.HibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name="alien_table")
//@Table(name="Alien_table1")-->to change the table table name
public class Alien {


	@Id
	private int aid;
	//@Transient-->By using this anotation, the data will not store into data base for that particluar column
 private Alienaname aname;
 @Column(name="atechnology") //-->to change the column name of the table
 private String atech;
 
public int getAid() {
	return aid;
}
public Alienaname getAname() {
	return aname;
}
public void setAname(Alienaname aname) {
	this.aname = aname;
}
public String getAtech() {
	return atech;
}
public void setAtech(String atech) {
	this.atech = atech;
}
public void setAid(int aid) {
	// TODO Auto-generated method stub
	
}



	
	
	
	
	


	


}
