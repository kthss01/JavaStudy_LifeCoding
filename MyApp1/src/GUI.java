import javax.swing.JOptionPane;

public class GUI {
	boolean isRunning;
	
	public GUI() {
		isRunning = true;
	}
	
	public Seller InitSeller() {
		String checkInit = JOptionPane.showInputDialog("Use Init? : YES");
		if(checkInit == null || checkInit.equals("YES")) 
			return new Seller();
		
		int dividendCnt = Integer.parseInt(JOptionPane.showInputDialog("Enter a dividendCnt"));
		double dividend[] = new double[dividendCnt];
		double dividendRatio[] = new double[dividendCnt];
		
		for (int i = 0; i < dividendCnt; i++) {
			dividend[i] = 0;
			double ratio = Double.parseDouble(JOptionPane.showInputDialog(i + "'s ratio")) * 0.1;
			dividendRatio[i] = ratio;
		}
		
		Seller seller = new Seller(dividend, dividendRatio);
		
		return seller;
	}
	
	public Buyer CreateBuyer() {
		double price = Double.parseDouble(JOptionPane.showInputDialog("Enter a Price"));
		
		Buyer buyer = new Buyer(price);

		return buyer;
	}
	
	public void Progress() {
		String progress = JOptionPane.showInputDialog("If you want to quit : EXIT");
		if (progress == null || progress.equals("EXIT"))
			isRunning = false;
		else
			isRunning = true;
	}
	
	public boolean IsRunning() {
		return isRunning;
	}
	
}
