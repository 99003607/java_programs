//CompanyMain class
package com.ltts.com;

import java.util.Scanner;

public class CompanyMain {
	
	public static void main(String[] args) {
		String n;
		String e;
		String l;
		Company c1=new Company();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Company name:");
		n=sc.next();
		c1.setName(n);
		System.out.println("Enter the employees:");
		e=sc.next();
		String[] str= e.split(",");
		c1.setEmployees(str);
		System.out.println("Enter TeamLead:");
		l=sc.next();
		c1.setTeamlead(l);
		if(c1.checkteam()==0)
		{
			System.out.println("Invalid input");
			return;
		}
		
		
		//output
		System.out.println("Name:"+(c1.getName()));
		System.out.print("Employees:");
		for(String ele:(c1.getEmployees()))
		{
			System.out.print(ele+",");
		}
		System.out.println();
		System.out.println("Lead:"+(c1.getTeamlead()));
	}
}
