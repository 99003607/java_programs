package com.ltts;

//this mechanism is called as encapsulation
public class Demo_variable 
{
	int a; // data member1 or property
	int b; //data member2
	//Normal method
	void displayInfo()
	{
		System.out.println(a+b);
	}
	
	void showInfo()
	{
		System.out.println("shoInfo method");
	}
	
	//main method
	public static void main(String[] args) 
	{
		//creating an object
		Demo_variable d=new Demo_variable(); //here d is object
		Demo_variable d1=new Demo_variable();
		d.a=10;
		d.b=20;
		d.displayInfo(); //30
		d.showInfo(); //show info method
		d1.showInfo(); //show info method
		//output is 0 since a and b of d1 is not initialized
		d1.displayInfo(); 
		d1.a=40;
		d1.b=50;
		d1.displayInfo();
	}
}
