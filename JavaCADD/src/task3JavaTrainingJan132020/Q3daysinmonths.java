package task3JavaTrainingJan132020;

import java.util.Scanner;

public class Q3daysinmonths {

	public static void main(String[] args) {
		
		//Program by Mark on 1/13/2020
		// JAVA program that takes user input 
		//from 1 to 12 for months, and display number of days of a particular month. 
		//(Shows “Invalid Details“ if incorrect month number will be provided).

	System.out.println("Enter a number between 1 and 12: ");	
	Scanner ip = new Scanner(System.in);
	int month = ip.nextInt();
	ip.close();
	
	switch(month)
	{
	case 1:case 3:case 5: case 7:case 8: case 10: case 12:
		System.out.println("The days are 31.");
		break;
	case 2:
		System.out.println("The days are 28 or 29.");
		break;
	case 4:case 6: case 9: case 11:
		System.out.println("The days are 30.");
		break;
	default:
		System.out.println("Invalid Details.");
	}	

		
	}

}
