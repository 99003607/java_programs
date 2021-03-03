//this and super keyword
package demo_inheritance;

class Vehicle
{
	int a;
	int b=20;
	Vehicle()
	{
		System.out.println("Default constructor");
	}
	Vehicle(int a)
	{
		this();//this will call default constructor
		this.a=a;
	}
	void displayInfo()
	{
		System.out.println("In displayInfo");
		System.out.println("a value is:"+a);
	}
	void showData()
	{
		System.out.println("In showData");
		this.displayInfo();
	}
}

class Vehicle11 extends Vehicle
{
	void getinfo()
	{
		//to access base class function
		super.showData();
		//to access base class variable
		System.out.println(super.b);
	}
}

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle v=new Vehicle(10);
		v.displayInfo();
		v.showData();
		System.out.println("-----------vehicle1-------------");
		Vehicle11 v1=new Vehicle11();
		v1.getinfo();
	}
}
