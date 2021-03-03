//static function
package com.ltts;

public class static_function {
	
	int a=10; //instance variable
	//a cannot be accessed inside the static function
	static void displayInfo(int b)
	{
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		displayInfo(20);
	}
}
