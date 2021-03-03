/*
 * parent -> interface
 * child -> implements
 */
package demo_inheritance;
interface Parent11
{
	void display11();
	void display12();
}

//look syntax
class Child11 implements Parent11
{
	void show()
	{
		System.out.println("In child1 class");
	}
	public void display11()
	{
		System.out.println("Parent11 class");
	}
	public void display12()
	{
		System.out.println("Parent12 class Interface method");
	}
}
public class multiple_1 {
	public static void main(String[] args) {
		Child11 c=new Child11();
		c.display11();
		c.display12();
		c.show();
	}
}
