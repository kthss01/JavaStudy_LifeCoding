
class Print {
//	public static String delimiter; // Ŭ������ ����
	public String delimiter = "";
	
	public Print(String delimiter) {
		this.delimiter = delimiter;
	}
	
	public void A() { // static�� Ŭ���� �Ҽ�
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