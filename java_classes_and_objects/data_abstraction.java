//data abstraction(data hiding)
package com.ltts;

public class data_abstraction {
	private String name;
	private int password;
	private float salary;
	void getInfo()
	{
		System.out.println(name+" "+password+" "+salary);
	}
	
	public static void main(String[] args) {
		data_abstraction d=new data_abstraction();
		d.name="sandesh";
		d.password=123456789;
		d.salary=1000;
		d.getInfo();
	}
}
