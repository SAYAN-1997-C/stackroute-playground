package com.stackroute.hospitalcore;

public class Doctor {

	String dname;
	int experience;
	Hospital hospitalobj;
	
	
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Doctor [dname=" + dname + ", experience=" + experience + ", hospitalobj=" + hospitalobj + "]";
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Hospital getHospitalobj() {
		return hospitalobj;
	}
	public void setHospitalobj(Hospital hospitalobj) {
		this.hospitalobj = hospitalobj;
	}
	
	
}
