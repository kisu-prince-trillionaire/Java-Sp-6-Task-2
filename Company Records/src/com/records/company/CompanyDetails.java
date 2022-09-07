package com.records.company;

public class CompanyDetails {
	int cid;
	String name;
	String city;
	double turnover;
	double noOfEmployees;
	
	
	public CompanyDetails() {
		System.out.println("Default Constructor");
	}
	public CompanyDetails(int cid, String name, String city, double turnover, double noOfEmployees) {
		this.cid = cid;
		this.name = name;
		this.city = city;
		this.turnover = turnover;
		this.noOfEmployees = noOfEmployees;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public double getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(double noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	
	public void display() {
		System.out.println(" | " +cid+ " | "+name+" | "+ city+ " | "+turnover+ " | "+noOfEmployees);
	}

}
