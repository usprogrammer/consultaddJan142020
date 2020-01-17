package task3JavaTrainingJan132020;

import java.util.Scanner;

public class Q4SumOfnNumbers {

	public static void main(String[] args) {

		//Program by Mark on 1/13/2020
				//JAVA program that takes one integer 
				//input n from the user, and display all the so, print sum of n natural numbers.
				
				Scanner ip = new Scanner(System.in);
				int n = ip.nextInt();
				ip.close();
				
				int sum = 0;
				for(int i=1;i<=n;i++)
				{	
				sum = sum + i;
				}			
				System.out.println(sum);

	}

}
