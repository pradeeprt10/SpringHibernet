package com.practice.ORM.SpringHibernet.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int stdid;
	private int fees;
	private String name;
	private String pancard;
	private String stdname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stdid, int fees, String name, String pancard, String stdname) {
		super();
		this.stdid = stdid;
		this.fees = fees;
		this.name = name;
		this.pancard = pancard;
		this.stdname = stdname;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", fees=" + fees + ", name=" + name + ", pancard=" + pancard + ", stdname="
				+ stdname + "]";
	}
	
	
	
	


}
