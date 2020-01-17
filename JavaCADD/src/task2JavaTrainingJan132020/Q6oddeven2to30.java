package task2JavaTrainingJan132020;

public class Q6oddeven2to30 {

	public static void main(String[] args) {
		
		//Program by Mark on 1/13/2020
//		Given an integer , perform the following conditional actions:
//				If  is odd, print NEW
//				If  is even and in the inclusive range of 2 to 5 , print OLD
//				If  is even and in the inclusive range of 6 to 30, print NEW
//				If  is even and greater than 30, print OLD
//		Complete the stub code provided in your editor to print whether or not  is weird.
	
		int x = 32;
		if(x%2!=0){
			System.out.println("NEW");
		}
		if(x%2==0){
			for(int y=2;y<6;y++)
			{
				if(x==y)
				System.out.println("OLD");
			}
		}
		if(x%2==0){
			for(int y=6;y<30;y++)
			{
				if(x==y)
				System.out.println("NEW");
			}
		}
		if(x%2==0&x>30)
			System.out.println("OLD");


	}

}
