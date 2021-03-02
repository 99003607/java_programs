import java.util.Scanner;

//if else
public class Demoifelse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your AGE:");
	int age=sc.nextInt();
	if(age>=18 && age<100)
	{
		System.out.println("Your eligible for voting");
	}
	else
	{
		System.out.println("Your not eligible for voting!!!! ");
	}
}
}
