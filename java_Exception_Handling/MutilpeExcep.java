//Multiple Exceptions
/*
 * Multiple catch blocks
 */
package exceptionhand;

public class MutilpeExcep {
	public static void main(String[] args) {
		try
		{
			//Arithmetic
			 int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
			
			//array
			int[] arr=new int[2];
			arr[3]=1;
			
			//String
			String s=null;
			System.out.println(s.length());
			System.out.println("Exception");
				
		}
		//ArthmeticException
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		//ArrayIndexOutOfBoundsException
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception");
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
