package com.ltts;

public class contructor 
{
	 int phone;
	 String name;
	 //default constructor
	 contructor() 
	 {
		System.out.println("default constructor");
	 }
	 //parameterized constructor
	 contructor(int a1)
	 {
		 phone=a1;
		 System.out.println("Value of a1 is:"+a1);
	 }
	 
	 //overloading of constructor
	 contructor(float a1)
	 {
		 phone=(int)a1;
		 System.out.println("Value of a1(float) is:"+a1);
	 }
	 
	public static void main(String[] args) 
	{
		//calling default constructor
		contructor c1=new contructor();
		//calling parameterized constructor
		contructor c2=new contructor(10);
		//calling float
		contructor c3=new contructor(100);
	}
}
