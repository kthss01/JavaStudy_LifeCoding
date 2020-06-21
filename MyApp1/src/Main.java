
// 나의 앱 만들기 1 - 수업 전 도전

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
