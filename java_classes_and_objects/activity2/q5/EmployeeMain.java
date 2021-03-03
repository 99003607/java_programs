//5) Employee main
package com.emp;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
	  String n;
	  String a;
	  String m;
	  Employee emp1=new Employee();
	  Scanner sc=new Scanner(System.in);
	  //name
	  System.out.println("Enter the name:");
	  n=sc.next();
	  emp1.setName(n);
	  //address
	  System.out.println("Enter Address:");
	  a=sc.next();
	  emp1.setAddress(a);
	  //mobile
	  System.out.println("Enter Mobile:");
	  m=sc.next();
	  emp1.setMobile(m);
	  
	  //output
	  System.out.println("Verify and Update the details");
	  while(true)
	  {
		  System.out.println("Menu");
		  System.out.println("1. Update Employee Name");
		  System.out.println("2. Update Employee Address");
		  System.out.println("3. Update Employee Mobile");
		  System.out.println("4. All information correct/Exit");
		  System.out.println("Enter your choice:");
		  int ch=sc.nextInt();
		  switch(ch)
		  {
		  	case(1):
		  			System.out.println("Enter Employee name:");
		  	        n=sc.next();
		  	        emp1.setName(n);
		  	        break;
		  	case(2):
	  			System.out.println("Enter Employee Address:");
	  	        a=sc.next();
	  	        emp1.setAddress(a);
	  	        break;
		  	case(3):
	  			System.out.println("Enter Employee Mobile:");
	  	        m=sc.next();
	  	        emp1.setMobile(n);
	  	        break;
		  	 case(4):
		  		 //display
	  			System.out.println("Name:"+(emp1.getName()));
		  	 	System.out.println("Adress:"+(emp1.getAddress()));
		  	 	System.out.println("Mobile:"+(emp1.getMobile()));
		  	 	return;
	  	        
		  }
	  }
	}
}
