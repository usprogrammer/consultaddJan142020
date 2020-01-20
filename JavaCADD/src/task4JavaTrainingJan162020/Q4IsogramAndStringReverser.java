package task4JavaTrainingJan162020;

import java.util.Scanner;

public class Q4IsogramAndStringReverser {

	public static void main(String[] args) {
		
		//Program by Mark on 1/16/2020
		//return a boolean true if the string doesn’t have repeating letters and consecutive or 
		//nonconsecutive i.e. all the letters of the string be unique (isogram) else false.
		//		a.	Write a JAVA program that reverse the words of a sentence.
		//		i.	For eg, => “Be Happy and Stay Motivated” => “eB yppah dna yatS detavitoM”. 

				
					System.out.println("Enter a sentence to find it's reversed String: ");
					Scanner ip = new Scanner(System.in);
					String x = ip.nextLine();
					ip.close();
					
					
					
					String st1[] = x.split(" ");
					
					x = x.replaceAll("\\s", "");
					//Reversing of String
					
					System.out.println("The reversed string is: ");
					for(int i=0;i<st1.length;i++)
					{
						char [] st2 = st1[i].toCharArray();
						
						for (int j = st2.length-1;j>=0;j--)
						{
						System.out.print(st2[j]);
						}
						System.out.println(" ");
					}
					
					//Isogram
//					for(String y: st1)
//					{
//						System.out.println(y);
//					}
					
					char arr[] = new char[x.length()];
					
					for(int i=0;i<x.length();i++)
					{
						//System.out.println(x.charAt(i));
						arr[i] = x.charAt(i);
						//System.out.println(arr[i]);
						
					}
					//System.out.println(arr.length);
					
					boolean nonrepeating = true;
					for(int i=0;i<arr.length;i++)
					{
						for(int k=0;k<arr.length;k++)
						{
							if(i==k)
							{
								//
							}
							else if(arr[i]==arr[k])
							{
								nonrepeating = false;
								System.out.println("It is repeating. Boolean is: " + nonrepeating);
								return;
							}
							
						}
						
					}
					System.out.println("It is not repeating. Boolean is: " + nonrepeating);
					
	}

}
