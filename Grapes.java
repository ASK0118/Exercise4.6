package Exercise4p6;

public class Grapes extends Fruit {

	protected int kJoules;
	protected int amount;
	protected String color;
	private double price;
	private String place;
	
	public Grapes(String name, int kJ, int a, String c, double d, String p) {
		super(name);
		this.kJoules = kJ;
		this.amount = a;
		this.color = c;
		this.price = d;
		this.place = p;
		
		if (this.amount<=500) { //if amount less than or equal to 500
			System.out.println("Quantity bought\t\t\t\t: " + this.amount + " gram");
			System.out.println("Price per gram "+ name + "\t\t\t: RM "+ this.price);
			System.out.println("Discount get\t\t\t\t: 0 %");
			System.out.printf("Total price of %d grams %s\t\t: RM %.2f%n", this.amount, name , this.amount*this.price);
		}
		
			else if(this.amount>500 && this.amount<=1000) { //if quantity more than 500 and less than or equal to 1000
				double TP; //declare variable for total price
				TotalPrice gtp = new GrapesTotalPrice(); //create a new object for TotalPrice grapes
				double newP = gtp.price();//declare and initialize the new price of grapes
				TP = gtp.totalPrice(amount);//initialize the total price of grapes
				System.out.println("Quantity bought\t\t\t\t: " + this.amount + " gram");
				System.out.println("Price per gram "+ name + "\t\t\t: RM " + newP);
				System.out.println("Discount get\t\t\t\t: 0% ");
				System.out.printf("Total price of %d grams %s\t\t: RM %.2f%n", this.amount, name ,TP);
		}
		
			else {
				double TP; //declare variable for total price
				double disc; //declare variable for discount
				Discount aa = new GrapesDiscount();  //create a new object for discount
				disc = aa.rateOfDiscount(); //initialize the discount
				TotalPrice gtp = new GrapesTotalPrice(); //create a new object for TotalPrice grapes
				double newP = gtp.price2(); //declare and initialize the new price of grapes
				TP = gtp.totalPrice(amount, disc); //initialize the total price of ograpes
				System.out.println("Quantity bought\t\t\t\t: " + this.amount + " gram");
				System.out.println("Price per gram "+ name + "\t\t\t: RM " + newP);
				System.out.printf("Discount get\t\t\t\t: %.2f percent", disc*100);
				System.out.printf("%nTotal price of %d grams %s\t: RM %.2f%n", this.amount, name ,TP);
		}
		if (this.color.equals("Red")) {
			int CN = calcNutrition(); //declare and initialize the calculate nutrition method
			System.out.println("Food energy provided by 100 g Red Grapes: "+ this.kJoules + " kJ");
			System.out.println("Food energy provided by " + this.amount + " g Red Grapes: "+ CN/100 + " kJ");
		}
		
		else if (this.color.equals("Green")) {
			int nKj = 300; //declare and initialize the kilo joules
			int CN = calcNutrition(nKj);//initialize the calculate nutrition method
			System.out.println("Food energy provided by 100 g Green Grapes: "+ nKj + " kJ");
			System.out.println("Food energy provided by " + this.amount + " g Green Grapes: "+ CN/100 + " kJ");
		}
		
		else
			System.out.println("There are no such color.");
	}
	
	/*public double totalPrice() {	// overloading method with no argument
		return this.price * this.amount;
		
	}
	
	public double totalPrice(double newP) {    // overloading method with 1 argument
		return newP * this.amount;
	}
	
	public double totalPrice(double newP, double disc) {     // overloading method with 2 argument
		return (newP * this.amount) - (newP * this.amount*disc);
	}*/
	
	 public int calcNutrition() {
		 return this.kJoules * this.amount;
	 }
	 
	 public int calcNutrition(int nKj) {
		 return nKj * this.amount;
	 }
	 
	 public String taste() {   //overriding method
			return "The taste of grapes\t\t\t: Sweet and Sour";
		}
	 
	 public String toString() {     //overriding method
			return "The origin of " + name + "\t\t\t: "+ this.place ;
		}
	
}

