package com.ltts;

public class demo_var {
	//These two variables a and b are called instance variable 
	int a=10; // data member1 or property
	int b=20; //data member2
	
	static int c=15;
	
	void displayInfo()
	{
		//local variables
		int a=100,b=200;
		System.out.println("In displayInfo");
		System.out.println(a+b);
		System.out.println(c);
		c++;
	}
	
	//main method
	public static void main(String[] args) 
	{
		//creating an object
		demo_var d=new demo_var(); //here d is object
		//demo_var d1=new demo_var();
		d.displayInfo(); //30
		System.out.println(c);
		//post increment
		c++;
		System.out.println(c);
		
		
	}
}
