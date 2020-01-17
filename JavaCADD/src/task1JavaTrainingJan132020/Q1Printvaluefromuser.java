package task1JavaTrainingJan132020;

import java.util.Scanner;

public class Q1Printvaluefromuser {

	public static void main(String[] args) {
		//Program by Mark on 1/13/2020
		//  Swap two numbers using third variable as result
		//  name and do the same task without using any third variable.
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int num = value.nextInt();
		value.close();
		System.out.println("The value is: " + num);


	}

}
