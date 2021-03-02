//Employee main
package com.ltts.com;

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
		System.out.println("Enter address:");
		a=sc.next();
		emp1.setAddress(a);
		//mobile
		System.out.println("Enter Mobile:");
		m=sc.next();
		emp1.setMobile(m);
		
		//output
		System.out.println("Employee Details");
		System.out.println("Name:"+emp1.getName());
		System.out.println("Address:"+emp1.getAddress());
		System.out.println("Mobile:"+emp1.getMobile());
		
	}
}
