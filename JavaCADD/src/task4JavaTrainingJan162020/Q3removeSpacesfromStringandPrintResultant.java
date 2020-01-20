package task4JavaTrainingJan162020;

import java.util.Scanner;

public class Q3removeSpacesfromStringandPrintResultant {

	public static void main(String[] args) {
		
		//Program by Mark on 1/16/2020
		//3.	Write a JAVA method to remove all the spaces
		//      from the String and return the resultant.

		System.out.println("Enter a sentence: ");
		Scanner ip = new Scanner(System.in);
		String x;
		x = ip.nextLine();
		ip.close();
		
		
		String words[] = x.split(" ");
		for(int i=0;i<words.length;i++)
		{
			System.out.print(words[i]);
		}
		
	}

}
