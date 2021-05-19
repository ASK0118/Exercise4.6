package Exercise4p6;

public class Orange extends Fruit {
	
	private double vitC;
	private int weight;
	private int quantity;
	private String taste;
	private String place;
	private double price;
	
	public Orange(String name, int w, String t, double vc, String p, double pr, int q) {
		
		super(name);
		this.vitC = vc;
		this.weight = w;
		this.taste = t;
		this.place = p;
		this.price = pr;
		this.quantity = q;
		
		
		if (this.quantity<=5) {   //if quantity less than or equal to 5
			System.out.println("Quantity bought\t\t\t: " + this.quantity);
			System.out.println("Price per "+ name + "\t\t: RM "+ this.price);
			System.out.println("Discount get\t\t\t: 0 %");
			System.out.println("Total price of " + this.quantity + " " + name + "\t\t: RM "+ price*quantity);
		}
		
			else if(this.quantity>5 && this.quantity<=20) { //if quantity more than 5 and less than or equal to 20
				double TP; //declare variable for total price
				TotalPrice otp = new OrangeTotalPrice(); //create a new object for TotalPrice orange
				double newP = otp.price();//declare and initialize the new price of orange
				TP = otp.totalPrice(quantity); //initialize the total price of orange
				System.out.println("Quantity bought\t\t\t: " + this.quantity);
				System.out.println("Price per "+ name + "\t\t: RM " + newP);
				System.out.println("Discount get\t\t\t: 0% ");
				System.out.printf("Total price of %d %s\t\t: RM %2f%n", this.quantity, name ,TP);
		}
		
			else {
				double TP;  //declare variable for total price
				double disc; //declare variable for discount
				Discount aa = new OrangeDiscount();  //create a new object for discount
				disc = aa.rateOfDiscount();  //initialize the discount
				TotalPrice otp = new OrangeTotalPrice(); //create a new object for TotalPrice orange
				double newP = otp.price2(); //declare and initialize the new price of orange
				TP = otp.totalPrice(quantity, disc); //initialize the total price of orange
				System.out.println("Quantity bought\t\t\t: " + this.quantity);
				System.out.println("Price per "+ name + "\t\t: RM " + newP);
				System.out.printf("Discount get\t\t\t: %.2f percent", disc*100);
				System.out.printf("%nTotal price of %d %s\t: RM %.2f%n", this.quantity, name ,TP);
		}
		
		if(this.weight<= 76) {
			getVitC();//call the method getVitC
			System.out.println("Weight\t\t\t\t: " + this.weight + " g");
			System.out.println("Size of orange\t\t\t: Small");
			System.out.printf("Amount of Vitamin C\t\t: %.2f mg%n", getVitC());
		}
		
		else if(this.weight > 76 && this.weight <= 88 ) {
			double nVC = 46.8;  //declare and initialized the new amount of vitamin C
			getVitC(nVC);//call the method getVitC
			System.out.println("Weight\t\t\t\t: " + this.weight + " g");
			System.out.println("Size of orange\t\t\t: Medium");
			System.out.printf("Amount of Vitamin C\t\t: %.2f mg%n", getVitC(nVC));
		}
		
		else if(this.weight >88) {
			double nVC = 63.82;//declare and initialized the new amount of vitamin C
			String harm = "You consume too much orange. It is very harmful!!!";//declare and initialized the string variable
			System.out.println("Weight\t\t\t\t: " + this.weight + " g");
			System.out.println("Size of orange\t\t\t: Large");
			System.out.printf("Amount of Vitamin C\t\t: %.2f mg%n%s", getVitC(nVC), harm);
		}
		
	}
	
	/*public double totalPrice() {	// overloading method with no argument
		return this.price * this.weight;
		
	}
	
	public double totalPrice(double newP) {    // overloading method with 1 argument
		return newP * this.weight;
	}
	
	public double totalPrice(double newP, double disc) {     // overloading method with 2 argument
		return (newP * this.weight) - (newP * this.weight*disc);
	}*/
	
	public double getVitC() {   //overloading method with no parameter  calculate the amount of vitamin c
		return this.vitC * this.weight;
	}
	
	public double getVitC(double nvc) {   //overloading method with 1 parameter   calculate the amount of vitamin c
		return nvc * this.weight;
	}
	 
	public String taste() {  //overriding method
		return "\nThe taste of orange\t\t: " + this.taste;
	}
	
	 public String toString() {     //overriding method
			return "The origin of " + name + "\t\t: "+ this.place ;
		}
}

