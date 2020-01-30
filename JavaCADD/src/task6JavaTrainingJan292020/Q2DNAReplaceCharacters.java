package task6JavaTrainingJan292020;

import java.util.Scanner;

public class Q2DNAReplaceCharacters {

	public static void main(String[] args) {
		//Program by Mark on Jan 29 2020
		
//		Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries
//		the "instructions" for the development and functioning of living organisms.
//		In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". 
//		DnaStrand.makeComplement("ATTGC")  return "TAACG" (in the result the A is replaced
//		by T, also, C is replaced by G and vice versa.)
//		DnaStrand.makeComplement("GTAT")  return "CATA"
		
		Scanner sc = new Scanner(System.in);
		String dna = sc.nextLine();
		sc.close();
		
		char[] DNA = new char[dna.length()];
		
		for(int i=0;i<dna.length();i++)
		{
			DNA[i] = dna.charAt(i);
		}
		
		for(int i=0;i<DNA.length;i++)
		{
			if(DNA[i] == 'A')
			{
				DNA[i] = 'T';
			}
			
			else if(DNA[i] == 'T')
			{
				DNA[i] = 'A';
			}
			
			if(DNA[i] == 'C')
			{
				DNA[i] = 'G';
			}
			
			else if(DNA[i] == 'G')
			{
				DNA[i] = 'C';
			}
			
		}
		
		for(int i=0;i<DNA.length;i++)
		{
			System.out.println(DNA[i]);
		}
		
	}

}
