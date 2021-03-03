//function overloading
package com.ltts;

public class overloading_member_function 
{
	void displayInfo()
	{
		System.out.println("WIthout any parameter");
	}
	void displayInfo(int a)
	{
		System.out.println("With one parameter a value is:"+a);
	}
	void displayInfo(int a,int b)
	{
		System.out.println("With two parameters  value result is:"+(a+b));
	}
	public static void main(String[] args) {
		overloading_member_function omf=new overloading_member_function();
		omf.displayInfo();
		omf.displayInfo(10);
		omf.displayInfo(10,20);
	}
}
