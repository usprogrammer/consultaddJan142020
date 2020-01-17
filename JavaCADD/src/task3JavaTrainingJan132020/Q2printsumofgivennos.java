package task3JavaTrainingJan132020;

import java.util.Scanner;

public class Q2printsumofgivennos {

	public static void main(String[] args) {
		
		//Program by Mark on 1/13/2020
//	 		Write a program in which:
//			a.	Take 10 values input from user using loop.
//			b.	Print sum of all the numbers provided
//			c.	Print the Average of those 10 values

			int y[] = new int[10];
			
			for(int i=0;i<10;i++)
			{
			@SuppressWarnings("resource")
			Scanner ip = new Scanner(System.in);			
			int x = ip.nextInt();
			
			y[i] = x;
			
			}
			int a=0;
			for(int i=0;i<10;i++)
			{
					int z = y[i];
					a = a + z;	
			}
			
			System.out.println("Sum is " + a);
			System.out.println("Average is " + a/10);
		
	}

}
