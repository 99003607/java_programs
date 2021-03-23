package Variables;

public class StaticBlock {
	//static variable
	static int a;
	
	//static block
	static
	{
		System.out.println("This is static block");
		a=20;
		System.out.println(a);
	}
	
	//static method
	static void infoDisplay()
	{
		a++;
		System.out.println("a="+a);
	}
	public static void main(String[] args) {
		System.out.println("This is main function");
		//calling static function
		StaticBlock.infoDisplay();
	}

}
