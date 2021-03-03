//Innings
package com.ltts.com;

public class Innings {
	private String teamname;
	private String inningname;
	private int runs;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningname() {
		return inningname;
	}
	public void setInningname(String inningname) {
		this.inningname = inningname;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	void displayInningsDetails()
	{
		System.out.println("Name:"+this.getTeamname());
		System.out.println("Scored:"+this.getRuns());
		String temp=(this.getInningname());
		if(temp.equals("First")) 
		{
			System.out.println("Need "+(this.getRuns()+1)+" to win");
		}
		else
		{
			System.out.println("Match Ended");
		}		
	}
}
