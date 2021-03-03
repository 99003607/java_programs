package com.ltts;

public class TestEmployee {
	public static void main(String[] args) {
		//object of employee class
		Employee e=new Employee();
		e.setAge(22);
		e.setName("Sandesh");
		e.setSalary(1000);
		System.out.println(e.getAge()+" "+e.getName()+" "+e.getSalary());
	}
}
