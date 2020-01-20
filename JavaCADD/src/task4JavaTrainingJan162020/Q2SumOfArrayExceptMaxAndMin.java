package task4JavaTrainingJan162020;

import java.util.Scanner;

public class Q2SumOfArrayExceptMaxAndMin {

	public static void main(String[] args) {
		
//		Program by Mark on 1/16/2020
		
//		2.	Write a JAVA program that gives sum of all the values of 
//		array except the highest and lowest values.
		
		System.out.println("Enter the size of the array: ");
		Scanner ip = new Scanner(System.in);
		int var = ip.nextInt();
		
		int a[] = new int[var];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter " + i + " element: ");
			@SuppressWarnings("resource")
			Scanner ip1 = new Scanner(System.in);
			int y = ip1.nextInt();
			a[i] = y;
		}
		
		int max = a[0];
		int min = a[0];
		int sum = 0;
		for (int i=0;i<a.length;i++)
		{
			
			if(max<a[i])
			{
				max = a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
			sum = sum + a[i];
			
		}
		System.out.println("Max is " + max);
		System.out.println("Min is " + min);
		
		sum = sum - max - min;
		
		System.out.println("Sum is: " + sum);
		
		ip.close();
		
		
	}

}
