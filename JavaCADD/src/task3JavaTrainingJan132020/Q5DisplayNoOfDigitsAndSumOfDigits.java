package task3JavaTrainingJan132020;

import java.util.Scanner;

public class Q5DisplayNoOfDigitsAndSumOfDigits {

	public static void main(String[] args) {
		
		//Program by Mark on 1/13/2020
//		JAVA program that takes long type input from user, and
//		a.	Calculate and display the number of digits.
//		b.	Calculate the sum of all the digits of the input.

		System.out.println("Enter a number: ");
		Scanner ip = new Scanner(System.in);
		long x = ip.nextLong();
		long y = x;
		ip.close();
		
		if(x==0)
		{
			System.out.println(1);
			System.out.println("The sum of all digits of the input is 0.");
			return;
		}
	
		else if(x<0)
		{
			x=x*(-1);
		}
		
		
		long i;
		for(i=0;x>0;i++)
		{
				x=x/10;
		}

		System.out.println("The number of digits are: " + i);
		
		if(y<0)
		{
			y=y*(-1);
		}
		long sum = 0;
		while (y!=0) {
			sum = sum + (y % 10);
			y = y / 10;
			
		}
		System.out.println("The sum of the digits is: "+sum);


	}

}
