import java.util.Scanner;

//Nested if
public class Demonestedif {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char c=sc.next().charAt(0);
		if(c>=65 && c<=90)
		{
			System.out.println("Alphabets in capital letters");
		}
		else
		{
			if(c>=97 && c<=122)
			{
				System.out.println("Alphabets in small letters");
			}
			else
			{
				if(c>=48 && c<=57)
				{
					System.out.println("It is a number");
				}
				else
				{
					System.out.println("It is a character");
				}
			}
		}
	}
}
