package task3JavaTrainingJan132020;

import java.util.Scanner;

public class Q1multiplicationtable {

	public static void main(String[] args) {
		
		//Program by Mark on 1/13/2020
//		1.	Write a simple program to print multiplication table of a certain number taken from user,
//		For eg. 2 X 1 = 2
//				2 X 2 = 4
//				and so on.

		System.out.println("Enter a number");
		Scanner mt = new Scanner(System.in);
		int x = mt.nextInt();
		mt.close();
		
		for(int i=1;i<11;i++)
		{
			System.out.println(x + " X " + i + " = " + (x*i));
		}

		
	}

}
