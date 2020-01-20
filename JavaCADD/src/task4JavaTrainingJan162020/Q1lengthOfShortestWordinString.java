package task4JavaTrainingJan162020;

import java.util.Scanner;

public class Q1lengthOfShortestWordinString {

	public static void main(String[] args) {
		//Program by Mark on 1/16/2020
		//Program that takes given String of words and return the length of the shortest word.
			
			System.out.println("Enter a sentence: ");
			Scanner ip = new Scanner(System.in);
			String x;
			x = ip.nextLine();
			ip.close();
			
			System.out.println("Entered sentence is: " + x);
			
			String words[] = x.split(" ");
			
			int y = words[0].length();
			int z = y;
			for(int i=1;i<words.length;i++)
			{
				if(y>words[i].length())
				{
					z = words[i].length();
				}
			}
		System.out.println(z);
	}

}
