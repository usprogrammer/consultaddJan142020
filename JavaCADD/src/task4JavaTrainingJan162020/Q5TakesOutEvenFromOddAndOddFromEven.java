package task4JavaTrainingJan162020;

public class Q5TakesOutEvenFromOddAndOddFromEven {

	public static void main(String[] args) {
		//Program by Mark on 1/18/2020
//		program that takes out the even from the odds and odd from the list of even numbers,
//		For eg, => {23,25,75,87,47,1,91,51,2} //Output for this case =>2
//		=> {22,44,64,76,98,12,43,54,90} // Output for this case =>43.

		int x[] = {22,44,64,76,98,12,43,54,90} ;
		
		int even[] = new int[x.length];
		
		int odd[] = new int[x.length];
		
		int j=0,k=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
			{
				even[i] = x[i];
				j++;
			}
			else if(x[i]%2!=0)
			{
				odd[i] = x[i];
				k++;
			}
		}

		if(j<k){
			for(int l=0;l<even.length;l++)
			{
				if(even[l]>0){
				System.out.println(even[l]);
			}
				
			}
				
		}
		else if(k<j)
		{
			for(int l=0;l<odd.length;l++)
			{
				if(odd[l]>0){
				System.out.println(odd[l]);
			}
			
			}
		}
		
		}
	}