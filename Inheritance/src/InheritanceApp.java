
class Cal {
	int v1, v2;

	Cal(int v1, int v2) {
		System.out.println("Cal init!!");
		this.v1 = v1;
		this.v2 = v2;
	}

	public int sum() {
		return v1 + v2;
	}

	public int sum(int v1, int v2) {
		System.out.println("Cal!!");
		return v1 + v2;
	}
	
	// overloading
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1 , v2) + v3;
	}
}

class Cal3 extends Cal {
	Cal3(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal3 init!!");
	}

	// override 재정의
	@Override
	public int sum(int v1, int v2) {
		System.out.println("Cal3!!");
		return super.sum(v1 , v2);
	}

	// 이것도 overloading
	public int sum(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	}
	
	public int minus() {
		return v1 - v2;
	}
}

public class InheritanceApp {

	public static void main(String[] args) {

		Cal c = new Cal(2, 1);
//		System.out.println(c.sum(2, 1)); // 3
//		System.out.println(c.sum(2, 1, 1)); // 4

		Cal3 c3 = new Cal3(2, 1);
//		System.out.println(c3.sum()); // 3
//		System.out.println(c3.minus()); // 1

		System.out.println(c3.sum(2, 1)); // 3
//		System.out.println(c3.sum(2, 1, 1)); // 4

	}

}

class Cal2 {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	public int minus(int v1, int v2) {
		return v1 - v2;
	}
}
