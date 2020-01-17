package task2JavaTrainingJan132020;

import java.util.Scanner;

public class Q4loopwithbreak {

	public static void main(String[] args) {
		
		//Program by Mark on 1/13/2020
				//Program in JAVA to break and continue if the following cases occurs:
				//			If user enters a negative number just break the loop and print “It’s Over”
				//			If user enters a positive number just continue in the loop and print “Good Going”

				int x = 1;
				while(x>0){
					System.out.println("Enter a number: ");
					@SuppressWarnings("resource")
					Scanner num = new Scanner(System.in);
					int y = num.nextInt();
					
					if(y<0){
						System.out.println("It's Over");
						num.close();
						break;
					}
					else if(y>=0)
					{
					System.out.println("Good Going");
					}
				
				}

	}

}
