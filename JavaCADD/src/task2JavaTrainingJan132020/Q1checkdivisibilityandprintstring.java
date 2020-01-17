package task2JavaTrainingJan132020;

public class Q1checkdivisibilityandprintstring {

	public static void main(String[] args) {
		
		//Program by Mark on 1/13/2020
				//Program in JAVA to perform the following operation:
				//If a number is divisible by 3 it should print “Consultadd” as a string
				//If a number is divisible by 5 it should print “JAVA Training” as a string
				//If a number is divisible by both 3 and 5 it should print “Consultadd JAVA Training” as a string.
				
				int num = 30;
				if(num%3==0)
				{
					System.out.println("Consultadd");
				}
				if(num%5==0)
				{
					System.out.println("JAVA Training");
				}
				if(num%3==0 && num%5==0)
				{
					System.out.println("Consultadd JAVA Training");
				}


	}

}
