package Exercise4p6;

class AppleTotalPrice implements TotalPrice{
	
	public double price() { 
		return 2.8;
	}
	
	public double price2() {
		return 2.5;
	}
	public double totalPrice(int quantity) {
		double newP = price(); //newP is new price
		return newP * quantity;
	}
	
	public double totalPrice(int quantity, double disc) {
		double newP= price2();  //newP is new price
		return (newP * quantity) - (newP * quantity*disc);
	}
}

class OrangeTotalPrice implements TotalPrice{
	
	public double price() {
		return 2.8;
	}
	
	public double price2() {
		return 2.5;
	}
	public double totalPrice(int quantity) {
		double newP = price();  //newP is new price
		return newP * quantity; 
	}
	
	public double totalPrice(int quantity, double disc) {
		double newP= price2();  //newP is new price
		return (newP * quantity) - (newP * quantity*disc);
	}
}

class GrapesTotalPrice implements TotalPrice{
	
	public double price() {
		return 0.01;
	}
	
	public double price2() {
		return 0.008;
	}
	public double totalPrice(int quantity) {
		double newP = price(); //newP is new price
		return newP * quantity;
	}
	
	public double totalPrice(int quantity, double disc) {
		double newP= price2(); //newP is new price
		return (newP * quantity) - (newP * quantity*disc);
	}
}
