
// ���� �� ����� 1 - ���� �� ����

public class Main {
	public static void main(String[] args) {
		
		GUI gui = new GUI();
		Seller seller = gui.InitSeller();
		
		while(gui.IsRunning()) {
			
			seller.Sell(gui.CreateBuyer());
			seller.Show();
			
			gui.Progress();
		}
		
	}
}
