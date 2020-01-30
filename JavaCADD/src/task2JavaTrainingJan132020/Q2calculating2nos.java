package task2JavaTrainingJan132020;

import java.util.Scanner;

public class Q2calculating2nos {

	public static void main(String[] args){
	
		//Program by Mark on 1/13/2020
				//Program in JAVA to perform the following operator based task:
				//Ask user to choose the following option first:
					//If User Enter 1 - Addition 
					//If User Enter 2 - Subtraction
					//If User Enter 3 - Division
					//If User Enter 4 - Multiplication
					//If User Enter 5 - Average
				//  Ask user to enter the 2 numbers in a variable for first and second(first and second are
				//      variable names) for the first 4 options mentioned above and print the result.
				//		Ask user to enter two more numbers as first1 and second2 for calculating the 
				//      average as soon as user choose an option 5.
				//		At the end if the answer of any operation is Negative print a statement saying 
				//      “Oops option X(1/2/3/4/5/) is returning the negative number”
				//		NOTE: At a time user can perform one action at a time.

				System.out.println("Enter the operation desired: ");
				Scanner operation = new Scanner(System.in);
				int calc = operation.nextInt();
//				operation.close();
				
				if(calc == 5)
				{
				System.out.println("Enter two numbers: ");
				
				Scanner n3 = new Scanner(System.in);
				int first1 = n3.nextInt(); 
				
				Scanner n4 = new Scanner(System.in);
				int second2 = n4.nextInt(); 
				
				n3.close();
				n4.close();
				
				int x = (first1 + second2)/2;
				System.out.println(x);
				if(x<0)
				{
					System.out.println("Oops option 5 is returning a negative number");
				}
				}
				else if(calc == 1|calc==2|calc==3|calc==4)
				{	
				System.out.println("Enter the first number: ");
				Scanner n1 = new Scanner(System.in);
				int first = n1.nextInt(); 
				
				System.out.println("Enter the second number: ");
				Scanner n2 = new Scanner(System.in);
				int second = n2.nextInt();
				
				n1.close();
				n2.close();
				
					switch (calc){
					case 1:
						int x = first + second;
						System.out.println(x);
						if(x<0)
						{
							System.out.println("Oops option 1 is returning a negative number");
						}
						break;
					case 2:
						x = first - second;
						System.out.println(x);
						if(x<0)
						{
							System.out.println("Oops option 2 is returning a negative number");
						}
						break;
					case 3:
						x = (first / second);
						System.out.println(x);
						if(x<0)
						{
							System.out.println("Oops option 3 is returning a negative number");
						}
						break;
					case 4:
						x = first * second;
						System.out.println(x);
						if(x<0)
						{
							System.out.println("Oops option 4 is returning a negative number");
						}
						break;
					}
					
				}		
				operation.close();
				
			}
	
	}
