
public class MyOOP {

	public static void main(String[] args) {
		
		Print p1 = new Print("----");
//		p1.delimiter = "----"; // 인스턴스의 delimiter
		
		//...
//		Print.delimiter = "----"; // 클래스의 delimiter
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print("****");
//		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
	}
}
