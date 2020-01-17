package task2JavaTrainingJan132020;

import java.util.Scanner;

public class Q7positiveornegative {

	public static void main(String[] args) {
		
		//Program by Mark on 1/13/2020
				//Program that reads a floating-point number and prints "zero" if the number is zero. 
				//Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number
				//is less than 1, or "large" if it exceeds 1,000,000.
				
				System.out.println("Enter a number: ");
				Scanner num1 = new Scanner(System.in);
				float x = num1.nextFloat();
				num1.close();
				
				if(x==0)
				{
					System.out.println("zero");
				}
				else if(x<0)
				{
					System.out.println("negative");
					if(x*(-1)<1)
					{
						System.out.println("small");
					}
					else if(x*(-1)>1000000)
					{
						System.out.println("large");
					}
					else
						System.out.println("The number is between 1 and 1000000");
				}
				else
				{
					System.out.println("positive");
				}
				

		
	}

}
