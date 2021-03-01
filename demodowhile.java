import java.util.Scanner;

//Do while
public class demodowhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,sum=0;
		do
		{
			System.out.println("Enter a number(to quit enter 0:");
			no=sc.nextInt();
			sum+=no;
		}while(no!=0);
		System.out.print("Sum:");
		System.out.print(sum);
	}
}
