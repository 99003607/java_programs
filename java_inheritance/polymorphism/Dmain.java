//abstract class
/*
 * abstract class is declaring class 
 * contains functions and abstract function
 * cannot create object of abstract class
 */
package polymorphism;
abstract class D1
{
	void displayInfo()
	{
		System.out.println("In parent class");
	}
	abstract void getInfo();
}

class D2 extends D1
{
	void getInfo()
	{
		System.out.println("In child class");
	}
}

public class Dmain 
{
	public static void main(String[] args) 
	{
		D2 d=new D2();
		d.displayInfo();
		d.getInfo();
	}
}
