package task3JavaTrainingJan132020;

import java.util.Scanner;

public class Q6threenosincreasigordecreasing {

	public static void main(String[] args) {
		
		//Program by Mark on 1/13/2020
//		Program that accepts three numbers from the user and prints "INCREASING" if the numbers are 
//		in increasing order, "DECREASING" if the numbers are in decreasing order, and 
//		"Neither increasing or decreasing order" otherwise. FOR eg.
//			Input first number: 1524
//			Input second number: 2345
//			Input third number: 3321 	
//		Output :
//		INCREASING

		System.out.println("Enter the first number: ");
		Scanner ip1 = new Scanner(System.in);
		int a = ip1.nextInt(); 
		
		System.out.println("Enter the second number: ");
		Scanner ip2 = new Scanner(System.in);
		int b = ip2.nextInt(); 
		
		System.out.println("Enter the third number: ");
		Scanner ip3 = new Scanner(System.in);
		int c = ip3.nextInt(); 
		
		ip1.close();
		ip2.close();
		ip3.close();
		
		if(a<b&&b<c)
		{
			System.out.println("INCREASING");
		}
		else if(a>b&&b>c)
		{
			System.out.println("DECREASING");
		}
		else
		{
			System.out.println("Neither increasing or decreasing order");
		}

		
	}

}
