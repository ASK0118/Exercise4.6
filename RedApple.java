package Exercise4p6;

public class RedApple extends Apple {

	private String color;
	
	public RedApple(String name, int q, double p, String pc, String c) {
		super(name, q, p, pc);
		this.color = c;
		
		color();
	}

	public void color() {
		System.out.println("Color of " + name + "\t\t: " + this.color);
	}
	public String toString() {    //overriding method
		return "The origin of " + name + "\t\t: "+ super.place ;
	}
	 
	public String taste() {    //overriding method
		return "The taste of Red Apple\t\t: Little bit sour" + "\n";
	}
	
}
