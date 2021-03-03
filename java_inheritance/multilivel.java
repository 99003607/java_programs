//multilevel
package demo_inheritance;

class Parents
{
	void displayInfo()
	{
		System.out.println("Parents class Method");
	}
}

class Childs extends Parents
{
	void getInfo()
	{
		System.out.println("Childs class method");
	}
}

class ChildChild extends Childs
{
	
	void showInfo()
	{
		System.out.println("ChildChild class method");
	}
}

public class multilivel {
	public static void main(String[] args) {
		ChildChild c1=new ChildChild();
		c1.displayInfo();
		c1.getInfo();
		c1.showInfo();
	}
}
