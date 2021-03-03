//function overriding
/*
 * same name of the function with same return type and parameters
 * but defined in base class and derived class.
 */
package polymorphism;

class VehicleDemo
{
	void displayInfo()
	{
		System.out.println("In parent class");
	}
}

class VehicleDemo1 extends VehicleDemo
{ 
	void displayInfo()
	{
		System.out.println("In child class");
	}
}
public class vehicleMain {

}
