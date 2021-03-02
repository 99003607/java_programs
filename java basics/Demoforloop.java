//For loops

public class Demoforloop {
	public static void main(String[] args) {
		int a=10;
		for(int i=0;i<a;i++)
		{
			System.out.println(i);
		}
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
