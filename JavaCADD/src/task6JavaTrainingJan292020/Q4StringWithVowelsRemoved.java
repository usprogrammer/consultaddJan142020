package task6JavaTrainingJan292020;

import java.util.Scanner;

public class Q4StringWithVowelsRemoved {
	
	//Program by Mark Jan 29 2020
//	Your task is to write a function that takes a string and return a new string
//	with all vowels removed.For example, the string "This website is for All!" 
//	would become "Ths wbst s fr LL!".

	public static void noVowels(String ip)
	{
		
		char novow[] = new char[ip.length()];
		
		for(int i=0;i<ip.length();i++)
		{
			if(ip.charAt(i) == 'A'||ip.charAt(i) == 'E'||ip.charAt(i) == 'I'||ip.charAt(i) == 'O'||ip.charAt(i) == 'U')
			{
				
			}
			else if(ip.charAt(i) == 'a'||ip.charAt(i) == 'e'||ip.charAt(i) == 'i'||ip.charAt(i) == 'o'||ip.charAt(i) == 'u')
			{
				
			}
			else
			{
				novow[i] = ip.charAt(i);
			}
		}
				
			for(int k=0;k<novow.length;k++)
			{
				System.out.print(novow[k]);
			}
					
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		sc.close();

		Q4StringWithVowelsRemoved.noVowels(ip);

	}

}
