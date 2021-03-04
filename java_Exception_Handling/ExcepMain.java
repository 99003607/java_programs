//Exception
/*
 * 1. Compile time exception
 * eg: File not found
 * 
 * 2. Run time exception
 * eg: Arithmetic Exception,StringOutOfBoundException
 * 	ArrayIndexOutOfBoundException , NullPointerException
 * 
 * 3. Error: Memory , however failure(we can't resolve this error in program).
 */
package exceptionhand;

public class ExcepMain {
		public static void main(String[] args)
		{
			try
			{
				//Arithmetic
				/*
				 int a=10,b=0,c;
				c=a/b;
				System.out.println(c);
				*/
				
				//array
				/*
				int[] arr=new int[2];
				arr[3]=1;
				*/
				
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
