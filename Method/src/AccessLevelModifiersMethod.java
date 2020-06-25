
class Greeting {
	// public, protected, default(생략 할 수 있음), private
	public static void hi() {
		System.out.println("Hi");
	}
}

public class AccessLevelModifiersMethod {

	public static void main(String[] args) {

		Greeting.hi(); // private이면 error

	}

}
