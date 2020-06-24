
public class EqualsApp {

	public static void main(String[] args) {

		String o1 = "java";
		String o2 = new String("java");
		// 자바에서는 이 두 가지를 조금 다르게 취급함
	
		System.out.println("a" == "a"); // 따라서 이건 같음
		System.out.println(new String("a") == new String("a")); // 이건 다름
		
	}

}
