//find the greater id
package com.ltts;

import java.util.Scanner;

public class greater_id {
	
	static int[] cricketer=new int[15];
	static int index=0;
	
	static void findCricketerId(int array[],int size,int score)
	{
		for(int i=1;i<size;i=i+2)
		{
			if(array[i]>score)
			{
				cricketer[index]=array[i-1];
				index++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of elements:");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid array size");
			return;
		}
		int[] arr=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
				arr[i]=sc.nextInt();
				if(arr[i]<0)
				{
					System.out.println("Invalid Input");
					return;
				}
		}
		System.out.println("Enter the score:");
		int score=sc.nextInt();
		if(score<0)
		{
			System.out.println("Invalid Score");
			return;
		}
		findCricketerId(arr,n,score);
		System.out.println("Cricketer,s id who scored more than the given score");
		for(int i=0;i<index;i++)
		{
			System.out.println(cricketer[i]);
		}
		
		
	}
}
