package Exercise4p6;

public class Apple extends Fruit {
	
	protected int quantity;
	protected double price;
	protected String place;
	
	public Apple(String name, int q, double p, String pc) {  //Constructor with 3 arguments
		super(name);
		this.quantity = q;
		this.price = p;
		this.place = pc;
		
		System.out.println("\nInfo of " + name );
		System.out.println("-----------------------------");
		
		if (this.quantity<=5) {    //if quantity less than or equal to 5

			System.out.println("Quantity bought\t\t\t: " + this.quantity);
			System.out.println("Price per "+ name + "\t\t\t: RM "+ this.price);
			System.out.println("Discount get\t\t\t: 0 %");
			System.out.println("Total price of " + this.quantity + " " + name + "\t\t: RM "+ quantity*price);
		}
		
			else if(this.quantity>5 && this.quantity<=20) { //if quantity more than 5 and less than or equal to 20
				double TP; //declare variable for total price
				TotalPrice atp = new AppleTotalPrice(); //create a new object for TotalPrice apple
				TP = atp.totalPrice(quantity);  //initialize the total price of apple
				double newP = atp.price();  //declare and initialize the new price of apple
				System.out.println("Quantity bought\t\t\t: " + this.quantity);
				System.out.println("Price per "+ name + "\t\t\t: RM " + newP);
				System.out.println("Discount get\t\t\t: 0% ");
				System.out.printf("Total price of %d %s\t\t: RM %.2f%n", this.quantity, name ,TP);
		}
		
			else {
				double TP;  //declare variable for total price
				double disc;  //declare variable for discount
				Discount aa = new AppleDiscount();  //create a new object for discount
				disc = aa.rateOfDiscount(); //initialize the discount
				TotalPrice atp = new AppleTotalPrice();//create a new object for TotalPrice apple
				double newP = atp.price2();   //declare and initialize the new price of apple
				TP = atp.totalPrice(quantity, disc);  //initialize the total price of apple
				System.out.println("Quantity bought\t\t\t: " + this.quantity);
				System.out.println("Price per "+ name + "\t\t\t: RM " + newP);
				System.out.printf("Discount get\t\t\t: %.2f percent", disc*100);
				System.out.printf("%nTotal price of %d %s\t\t: RM %.2f%n", this.quantity, name ,TP);
		}
	}
	
	/*public double totalPrice() {	// overloading method with no argument
		return this.price * this.quantity;
		
	}
	
	public double totalPrice(double newP) {    // overloading method with 1 argument
		return newP * this.quantity;
	}
	
	public double totalPrice(double newP, double disc) {     // overloading method with 2 argument
		return (newP * this.quantity) - (newP * this.quantity*disc);
	}*/
	
	public String toString() {     //overriding method
		return "The origin of " + name + "\t\t: "+ this.place ;
	}
	
	public String taste() {     //overriding method
		return "The taste of Apple\t\t: Sweet" + "\n";
	}
}

