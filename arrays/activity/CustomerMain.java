//CUstomer Main
package com.ltts.com;

import java.util.Scanner;

public class CustomerMain 
{
	public static void main(String[] args) 
	{
		String s;
		Customer c1=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details:");
		s=sc.next();
		String[] arrstr= s.split(",");
		c1.setName(arrstr[0]);
		c1.setAddress(arrstr[1]);
		c1.setMobile(arrstr[2]);
		
		//output
		System.out.println("Name:"+c1.getName());
		System.out.println("Address:"+c1.getAddress());
		System.out.println("Mobile:"+c1.getMobile());
		
	}
	
	
}
