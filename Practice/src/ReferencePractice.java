
class K {
	public int id;
	K(int id) {
		this.id = id;
	}
}

public class ReferencePractice {

	static void _value(int b) {
		b = 2;
	}
	
	public static void runValue() {
		int a = 1;
		_value(a);
		System.out.println("runValue, " + a);
	}
	
	static void _reference1(K b) {
		b = new K(2);
	}
	
	public static void runReference1() {
		K a = new K(1);
		_reference1(a);
		System.out.println("runReference1, " + a.id);
	}
	
	static void _reference2(K b) {
		b.id = 2;
	}
	
	public static void runReference2() {
		K a = new K(1);
		_reference2(a);
		System.out.println("runReference2, " + a.id);
	}
	
	
	
	public static void main(String[] args) {
		runValue(); // runValue, 1 // 복사
		runReference1(); // runReference1, 1 // 지역변수인 b의 데이터를 교체한 것일 뿐이기 때문에 결과 영향 안미침
		runReference2(); // runReference2, 2 // 참조
	}

}
