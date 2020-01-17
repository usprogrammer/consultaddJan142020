package task1JavaTrainingJan132020;

import java.util.Scanner;

public class Q3addtwonosandadd30 {

	public static void main(String[] args) {
		
		//Program by Mark on 1/13/2020
				//Program to complete the task given below:
		        //Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable call z.
		        //Use z for adding 30 into it and print the final result by using variable results.

				Scanner val1 = new Scanner(System.in);
				System.out.println("Enter the first value between 1 to 10: ");
				int num1 = val1.nextInt();
				
				Scanner val2 = new Scanner(System.in);
				System.out.println("Enter the second value between 1 to 10: ");
				int num2 = val2.nextInt();
				
				val1.close();
				val2.close();
				
				int z = num1 + num2;
				int results = z + 30;
				System.out.println(results);


	}

}
