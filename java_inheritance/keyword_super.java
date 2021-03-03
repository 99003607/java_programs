//super keyword
package demo_inheritance;

class p1
{
	protected int a=10;
	void display()
	{
		System.out.println("Value of a:"+a);
	}
}
class c1  extends p1
{
	int a=30;
	void showInfo()
	{
		System.out.println("this.a:"+this.a);
		System.out.println("super.a:"+super.a);
	}
}

public class keyword_super 
{
	public static void main(String[] args) {
		c1 c=new c1();
		c.showInfo();
	}
}
