package task5JavaTrainingJan232020;

public class Student {
	
	public Student(String name){
		
		System.out.println("The name is: " + name);
	}
	
	public Student(){
		System.out.println("The name is unknown");
	}
	
	
	
	public static void main(String[] args) {
		//Program by Mark Jan 23 2020
		// Write a program to print the names of students by creating a Student class.
		//If no name is passed while creating an object of Student class, then the name
		//should be "Unknown", otherwise the name should be equal to the String value passed
		//while creating object of Student class. (Hint: Overloading concept)

		Student s1 = new Student("Bond, James Bond");
		Student s2 = new Student();
		
	}

}
