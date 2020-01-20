package task4JavaTrainingJan162020;

import java.util.Scanner;

public class Q6SwapToUpperOrLowerCase {

	public static void main(String[] args) {
		//Program by Mark on Jan 18 2020
		
//		Program that swaps the case of the alphabets of the string,
//		a.	For eg,  => “heLLo WOrLd” => “HEllO woRlD”.

		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		sc.close();

		char swap[] = new char[ip.length()];
		for(int i=0;i<ip.length();i++)
		{
			if(Character.isUpperCase(ip.charAt(i)))
			{
				swap[i] = Character.toLowerCase(ip.charAt(i));
			}
			else if(Character.isLowerCase(ip.charAt(i)))
			{
				swap[i] = Character.toUpperCase(ip.charAt(i));
			}
		}
		
		for(int i=0;i<swap.length;i++)
			{
				System.out.print(swap[i]);
			}
	}
}