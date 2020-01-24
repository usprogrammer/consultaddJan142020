package task5JavaTrainingJan232020;

public class Employee {
	
	String name;
	int year;
	String address;
	
	public Employee(String name, int year, String address){
		this.name = name;
		this.year = year;
		this.address = address;
		System.out.println();
		System.out.println(name + " " + year + " " + address);
	}

	public static void main(String[] args) {
		//Program by Mark on Jan 23 2020
//		Write a program that would print the information (name, year of joining, salary, address) 
//		of three employees by creating a class named 'Employee'. The output should be as follows:
//			Name        Year of joining        Address
//			Robert            1994                64C- Walls Streat
//			Sam                2000                68D- Walls Streat
//			John                1999                26B- Walls Streat

		System.out.println("Name " + " Year of joining " + " Address ");
		Employee e1 = new Employee("Robert",1994,"64C- Walls Street");
		Employee e2 = new Employee("Sam",2000,"68D- Walls Street");
		Employee e3 = new Employee("John",1999,"26B- Walls Street");
	}

}
