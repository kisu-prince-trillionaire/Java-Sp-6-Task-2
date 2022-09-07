package com.records.company;

public class CompanyRecordsMain {

	public static void main(String[] args) {
		CompanyDetails cd[];
		cd = new CompanyDetails[4];
		
		cd[0] = new CompanyDetails(1,"bhavna","noida",10000000,19876);
		cd[1] = new CompanyDetails(1,"tcs","pune",1000000000,1975447656);
		cd[2] = new CompanyDetails(1,"wipro","banglore",156400000,9855646);
		cd[3] = new CompanyDetails(1,"cognizant","chennai",100000,10000);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("The Company Details are : ");
		for(CompanyDetails cd1: cd) {
			cd1.display();
		}
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Companies having employee greater than 100");
		for(CompanyDetails cd1: cd) {
			if(cd1.getNoOfEmployees() > 100)
				cd1.display();
		}System.out.println("Nothing to show");
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Companies having office in patan");
		for(CompanyDetails cd1: cd) {
			if(cd1.getCity() == "Patan")
				cd1.display();
		}System.out.println("Nothing to show");
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Companies having turnover between 1000 - 10000");
		for(CompanyDetails cd1: cd) {
			if(cd1.getTurnover() >= 1000 && cd1.getTurnover() <= 10000)
				cd1.display();
		}System.out.println("Nothing to show");
		System.out.println("-----------------------------------------------------------");
		   
	}

}
//Write Program to accept the Company records as cId,name,city,turnover,number of emloyees
//and
//1.Display All Companies
//2.Display All Companies having employee greater than 100
//3. Display All Companies  from Patan
//4. Display All Companies Record having turnover between 1000-10000