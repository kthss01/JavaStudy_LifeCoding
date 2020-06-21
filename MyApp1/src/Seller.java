
public class Seller {
	double dividendRatio[];
	double dividend[];
	double totalDividend[];
	
	double income;
	double totalIncome;
	double expense;
	
	public Seller() {
		expense = 0.3;
		income = 0;
		totalIncome = 0;
		
		int dividendCnt = 3;
		dividend = new double[dividendCnt];
		dividendRatio = new double[dividendCnt];
		totalDividend = new double[dividendCnt];
		dividendRatio[0] = 0.5;
		dividendRatio[1] = 0.3;
		dividendRatio[2] = 0.2;
	}
	
	public Seller(double dividend[], double dividendRatio[]) {
		expense = 0.3;
		income = 0;
		totalIncome = 0;
		totalDividend = new double[dividend.length];
		
		this.dividend = dividend;
	}
	
	public void Sell(Buyer buyer) {
		income = buyer.price * (1.0 - expense);
		totalIncome += income;
		
		for (int i = 0; i < dividend.length; i++) {
			dividend[i] += income * dividendRatio[i];
		}
	}
	
	public void Show() {
		System.out.println("Receipt");
		
		System.out.println("Income : " + income);
		System.out.println("Expense : " + expense);
		System.out.println("Divended");
		for (int i = 0; i < dividend.length; i++) {
			System.out.println("\t" + i + "'s dividend : " + dividend[i]);
		}
	}
}
