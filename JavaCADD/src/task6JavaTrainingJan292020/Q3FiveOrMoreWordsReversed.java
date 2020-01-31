package task6JavaTrainingJan292020;

import java.util.Scanner;

public class Q3FiveOrMoreWordsReversed {
	//Program by Mark Jan 29 2020
//	Write a function that takes in a string of one or more words, and returns the same
//	string, but with all five or more letter words reversed. Strings passed in will consist
//	of only letters and spaces. Spaces will be included only when more than one word is
//	present.Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//	spinWords( "This is a test") => returns "This is a test" spinWords( "This is another"
//	+ " test" )=> returns "This is rehtona test"
	
	public static void spinWords(String x)
	{
		String st1[] = x.split(" ");
	
		for(int i=0;i<st1.length;i++)
		{
		
			if(st1[i].length()>5)
			{
				for(int j=0;j<st1[i].length();j++)
				{
					char [] st2 = st1[j].toCharArray();
					
					for (int k = st2.length-1;k>=0;k--)
					{
					System.out.print(st2[k]);
					}
					System.out.println(" ");
				}
					
			}
			else
			{
				//System.out.println(st1[i]);
			}
		
		}
	
	}
	public static void main(String[] args) {
		

		System.out.println("Enter a sentence to find it's reversed String: ");
		Scanner ip = new Scanner(System.in);
		String x = ip.nextLine();
		ip.close();
		
		Q3FiveOrMoreWordsReversed.spinWords(x);
		
	}

}
