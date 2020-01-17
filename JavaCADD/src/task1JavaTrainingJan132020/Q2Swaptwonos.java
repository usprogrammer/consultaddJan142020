package task1JavaTrainingJan132020;

public class Q2Swaptwonos {

	public static void main(String[] args) {

		//Program by Mark on 1/13/2020
		//Swap two numbers using third variable as result name and do the same task without using
		//any third variable.
				int x = 55 , y = 6699;
				System.out.println("x is: " + x);
				System.out.println("y is: " + y);
				int result;
				result = x;
				x=y;
				y=result;
				System.out.println("After swap x is: " + x);
				System.out.println("After swap y is: " + y);
				
				//No variable used in swapping
				int a = 88965 , b = 5523;
				System.out.println("a is: " + a);
				System.out.println("b is: " + b);
				a = a*b;
				b = a/b;
				a = a/b;
				System.out.println("After swap a is: " + a);
				System.out.println("After swap b is: " + b);

		
	}

}
