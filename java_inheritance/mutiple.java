//mutile inheritance
package demo_inheritance;

class Parent1
{
	void display1()
	{
		System.out.println("Parent1 class");
	}
}
interface Parent2
{
	//abstract method
	public void display2();
}

//look syntax
class Child1 extends Parent1 implements Parent2
{
	void show()
	{
		System.out.println("In child1 class");
	}
	public void display2()
	{
		System.out.println("Parent2 class Interface method");
	}
}

public class mutiple {
	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.display1();
		c1.display2();
		c1.show();
	}
}
