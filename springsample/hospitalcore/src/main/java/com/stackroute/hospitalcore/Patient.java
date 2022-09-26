package com.stackroute.hospitalcore;

public class Patient {
	
	@Override
	public String toString() {
		return "Patient [pname=" + pname + ", issues=" + issues + ", hospital=" + hospital + "]";
	}

	String pname;
	String issues;
	
	
	Hospital hospital;
 public Patient()
 {
	 
 }
	
	public Patient(String pname, String issues, Hospital hospital) {
		super();
		this.pname = pname;
		this.issues = issues;
		this.hospital = hospital;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getIssues() {
		return issues;
	}

	public void setIssues(String issues) {
		this.issues = issues;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
	
	

	
	
}
