import java.util.Scanner;

//check if it is a palindrome
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int no=sc.nextInt();
		int temp=no,rem;
		double sum=0;
		int digit=-1;
		while(temp>0)
		{
			digit++;
			temp=temp/10;
		}
		temp=no;
		while(temp>0)
		{
			rem=temp%10;
			sum=(int) (sum+rem*(Math.pow(10, digit)));
			digit--;
			temp=temp/10;
		}
		if((int)sum==no)
		{
			System.out.println("It is a palindrome number");
		}
		else
		{
			System.out.println("It is not a palindrome number");
		}
	}
}
