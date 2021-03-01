//taking input from the user
import java.util.Scanner;

public class Demoinput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age of the Candidate:");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible for vote");
		}
	}

}

