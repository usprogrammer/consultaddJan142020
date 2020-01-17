package task2JavaTrainingJan132020;

public class Q5print0to6except3and6 {

	public static void main(String[] args) {
		
		//Program by Mark on 1/13/2020
				//Program that prints all the numbers from 0 to 6 except 3 and 6.
				//Expected output: 0 1 2 4 5

				for(int i=0;i<7;i++)
				{
					if(i==3|i==6)
					continue;
					System.out.println(i);
				}


	}

}
