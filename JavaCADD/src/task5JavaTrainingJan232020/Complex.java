package task5JavaTrainingJan232020;

import java.util.Scanner;

public class Complex {
	//Program by Mark on Jan 23 2020

//	Print the sum, difference and product of two complex numbers by creating a class
//	named 'Complex' with separate methods for each operation whose real and imaginary
//	parts are entered by user.
	
	double x,z;
	Complex(){};
	
	public Complex(double x,double z)
	{
		this.x = x;
		this.z = z;
	}

	public static Complex sum(Complex c1,Complex c2)
	{
		Complex total = new Complex();
		double real = c1.x + c2.x;
		double img = c1.z + c2.z;
		System.out.println("The sum is: " + real + " + " + img + "i");
		return total;
	}
	
	public static Complex diff(Complex c1, Complex c2)
	{
		Complex diff = new Complex();
		double real = c1.x - c2.x;
		double img = c1.z - c2.z;
		System.out.println("The difference is: " + real + " + " + img +"i");
		return diff;
	}
	
	public static Complex prod(Complex c1, Complex c2)
	{
		Complex pro = new Complex();
		double real = c1.x * c2.x;
		double img = c1.z * c2.z;
		System.out.println("The product is: " + real + " + " + img +"i");
		return pro;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the first number(Real): ");
		Scanner sc1 = new Scanner(System.in);
		double x1 = sc1.nextDouble();
		
		System.out.println("Enter the first number(Imaginary): ");
		Scanner sc2 = new Scanner(System.in);
		double z1 = sc2.nextDouble();
		
		System.out.println("Enter the second number(Real): ");
		Scanner sc3 = new Scanner(System.in);
		double x2 = sc3.nextDouble();
		
		System.out.println("Enter the second number(Imaginary): ");
		Scanner sc4 = new Scanner(System.in);
		double z2 = sc4.nextDouble();
		
		Complex c1 = new Complex(x1,z1);
		Complex c2 = new Complex(x2,z2);
		
		Complex csum = sum(c1,c2);
		Complex cdiff = diff(c1,c2);
		Complex multi = prod(c1,c2);

	}

}
