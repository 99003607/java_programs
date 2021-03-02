import java.util.Scanner;

//While loop
public class Demowhileloop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		int i=1;
		System.out.println("----Table Generator----");
		while(i<=10)
		{
			System.out.print(no);
			System.out.print("*");
			System.out.print(i);
			System.out.print("=");
			System.out.print(i*no);
			System.out.println();
			i++;
		}
	}
}
