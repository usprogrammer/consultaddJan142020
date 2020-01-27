package task5JavaTrainingJan232020;

public class AddAmount {
	//Program by Mark on Jan 23 2020
//	Suppose you have a Saving Box with an initial amount of $50 and you have to add 
//	some more to it. Create a class 'AddAmount' with a data member named 'amount' with an
//	initial value of $50. Now make two constructors of this class as follows:
//		1 - without any parameter - no amount will be added to the Saving Box
//		2 - having a parameter which is the amount that will be added to Saving Box
//		Create object of the 'AddAmount' class and display the final amount in Saving Box.
//		Also, create a method that can display how many transactions are done on the Saving Box.
	
	static int amount = 50;
	static int count = 0;
	
	public AddAmount(){
		count++;
		System.out.println("The final amount is: " + this.amount);
	}
	
	public AddAmount(int amount){
		count++;
		this.amount = this.amount + amount;
		System.out.println("The final amount is: " + this.amount);
	}
	
	public static int gettotaltrans(){
		System.out.print("The transactions done on the Saving Box are: ");
		return count;
	}
	
	public static void main(String[] args) {
		AddAmount add1 = new AddAmount();
		AddAmount addx = new AddAmount();
		AddAmount addy = new AddAmount();
		AddAmount add2 = new AddAmount(50);
		AddAmount add3 = new AddAmount(100);
		AddAmount add4 = new AddAmount(150);
		AddAmount addz = new AddAmount();
		AddAmount add5 = new AddAmount(200);
		AddAmount add6= new AddAmount(50);
		System.out.println(AddAmount.gettotaltrans());
	}

}
