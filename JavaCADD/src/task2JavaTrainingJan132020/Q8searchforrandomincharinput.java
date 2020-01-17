package task2JavaTrainingJan132020;

import java.util.Scanner;

public class Q8searchforrandomincharinput {

	public static void main(String[] args) {

		//Program by Mark on 1/13/2020
//		Write a JAVA program which takes character input from the user,
//		If the character is from r, a, n, d, o, m (consider both upper and lower cases), 
//		then print FOUND.
//		Print NOT FOUND for all the other alphabets.

		System.out.println("Enter a character: ");
		Scanner ip = new Scanner(System.in);
		char ch = ip.next().charAt(0);
		ip.close();
		
		char r='r',a='a',n='n',d='d',o='o',m='m';
		char R='R', A='A', N='N', D='D', O='O', M='M';
		if(ch==r||ch==a||ch==n||ch==d||ch==o||ch==m||ch==R||ch==A||ch==N||ch==D||ch==O||ch==M)
		{
			System.out.println("FOUND");
		}
		else
		{
			System.out.println("NOT FOUND");
		}


	}

}
