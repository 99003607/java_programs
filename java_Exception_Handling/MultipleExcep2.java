package exceptionhand;

public class MultipleExcep2 {
	public static void main(String[] args) {
		try
		{
			//Arithmetic
			try
			{
				 int a=10,b=0,c;
					c=a/b;
					System.out.println(c);
			}
			//ArthmeticException
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Exception");
			}
			
			//array
			try
			{
				int[] arr=new int[2];
				arr[3]=1;
			}
			//ArrayIndexOutOfBoundsException
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBounds Exception");
			}
			
			//String
			String s=null;
			System.out.println(s.length());
			System.out.println("Exception");
		}
		
		catch(Exception e)
		{
			System.out.println("Runtime Exception-> "+e);
		}
		finally
		{
			System.out.println("Program End");
		}
	}
}
