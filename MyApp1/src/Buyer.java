
public class Buyer {
	double price;
	double vat;
	
	public Buyer() {
		price = 0;
		vat = 0;
	}
	
	public Buyer(double price) {
		this.price = price;
		vat = price * 0.1;
	}
	
	public double Price() {
		return price;
	}
	
	public double Vat() {
		return vat;
	}
}
