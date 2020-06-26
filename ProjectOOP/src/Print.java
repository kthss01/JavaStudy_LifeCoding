
class Print {
//	public static String delimiter; // 클래스의 변수
	public String delimiter = "";
	
	public Print(String delimiter) {
		this.delimiter = delimiter;
	}
	
	public void A() { // static은 클래스 소속
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	//...
}