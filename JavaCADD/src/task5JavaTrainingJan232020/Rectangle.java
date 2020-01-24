package task5JavaTrainingJan232020;

public class Rectangle {

	int length;
	int breadth;
	
	public int area(){
		int area = length*breadth;
		return area;
	}
	
	public Rectangle(){
		length = breadth = 0;
		System.out.println(area());
	}
	
	public Rectangle(int length,int breadth){
			this.length = length;
			this.breadth = breadth;
			System.out.println(area());
		}
	
	public Rectangle(int length){
			this.length = this.breadth = length;
			System.out.println(area());
		}
		
	public static void main(String[] args) {
		// 

//		Create a class named 'Rectangle' with two data members- length and breadth and a method
//		to calculate the area which is 'length*breadth'. The class has three constructors which are :
//			1 - having no parameter - values of both length and breadth are assigned zero.
//			2 - having two numbers as parameters - the two numbers are assigned as length and
//				breadth respectively.
//			3 - having one number as parameter - both length and breadth are assigned that number.
//			Now, create objects of the 'Rectangle' class having none, one and two parameters and
//			print their areas.

		Rectangle r1 =new Rectangle();
		Rectangle r2 =new Rectangle(55);
		Rectangle r3 =new Rectangle(38,95);
	}

}
