//inheritance
package demo_inheritance;

class Parent
{
	void displayInfo()
	{
		System.out.println("Parent class Method");
	}
}

class Child extends Parent
{
	void getInfo()
	{
		System.out.println("Child class method");
	}
}

public class in1 {
	public static void main(String[] args) {
		/* child object*/
		System.out.println("|---------child--------|");
		Child c1=new Child();
		//method of parent
		c1.displayInfo();
		//method of child
		c1.getInfo();
		
		/*Parent object*/
		System.out.println("|--------parent-------|");
		Parent p1=new Parent();
		p1.displayInfo();
	}
}
