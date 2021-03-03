//final keyword
package demo_inheritance;
class VehicleDemo
{
	final int a=10; //like constant
	void displayInfo()
	{
		int a=15;
		System.out.println(a);
	}
}

class VehicleDemo1 extends Vehicle
{
	//cannot redefine the displayInfo in child of VehicleDemo1 
	final void displayInfo()
	{
		System.out.println(a+5);
	}
}
public class VehicleMain1 {

}
