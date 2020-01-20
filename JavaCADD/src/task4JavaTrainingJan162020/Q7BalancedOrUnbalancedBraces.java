package task4JavaTrainingJan162020;

import java.util.Scanner;

public class Q7BalancedOrUnbalancedBraces {

	public static void main(String[] args) {
		//Program by Mark on Jan 18 2020
//		Program that gives boolean values; true, if the string has balanced braces and false, if the string has unbalanced braces:
//			For eg,  => “({{)}[}]()” //output => true
//			 => “[})(” //output => false.

		System.out.println("Enter a group of Braces : ");
		Scanner ip = new Scanner(System.in);
		String x = ip.nextLine();
		ip.close();
		
		int osqbrac = 0;
		int csqbrac = 0;
		
		int ocubrac = 0;
		int ccubrac = 0;
		
		int opabrac = 0;
		int cpabrac = 0;
		
		for(char i=0;i<x.length();i++)
		{
			if(x.charAt(i)=='[')
			{
				osqbrac++;
			}
			if(x.charAt(i)==']')
			{
				csqbrac++;
			}
			
			
			if(x.charAt(i)=='(')
			{
				opabrac++;
			}
			if(x.charAt(i)==')')
			{
				cpabrac++;
			}
			
			
			if(x.charAt(i)=='{')
			{
				ocubrac++;
			}
			if(x.charAt(i)=='}')
			{
				ccubrac++;
			}

		}
		//System.out.println(osqbrac + ":" + csqbrac  + ":" + opabrac + ":" + cpabrac + ":" + ocubrac + ":" + ccubrac);
		
		boolean equalbrackets = true;
		if((osqbrac==0&&csqbrac==0)&&((ocubrac==0&&ccubrac==0))&&((opabrac==0&&cpabrac==0)))
				{
					System.out.println("No brackets");
				}
		else if(osqbrac==csqbrac&&ocubrac==ccubrac&&opabrac==cpabrac)
		{
			System.out.println("Are the brackets equal: " + equalbrackets);
		}
		else
		{
			equalbrackets = false;
			System.out.println("Are the brackets equal: " + equalbrackets);
		}

	}

}
