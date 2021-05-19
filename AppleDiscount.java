package Exercise4p6;

class AppleDiscount implements Discount{  //because we use interface
	
	public float rateOfDiscount() {
		return 0.2f;
	}
	
}

class GrapesDiscount implements Discount{
	
	public float rateOfDiscount() {
		return 0.3f;
	}
}

class OrangeDiscount implements Discount{
	
	public float rateOfDiscount() {
		return 0.25f;
	}
}