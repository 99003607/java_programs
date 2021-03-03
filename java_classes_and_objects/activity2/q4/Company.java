//Company class
package com.ltts.com;

public class Company {
	private String name;
	private String[] Employees;
	private String teamlead;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getEmployees() {
		return Employees;
	}
	public void setEmployees(String[] employees) {
		Employees = employees;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	
	int checkteam()
	{
		for(String ele:(this.Employees))
		{
			if(ele.equals(this.teamlead))
			{
				return(1);
			}
		}
		return(0);
	}
}
