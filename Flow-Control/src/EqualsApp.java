
public class EqualsApp {

	public static void main(String[] args) {

		String o1 = "java";
		String o2 = new String("java");
		// �ڹٿ����� �� �� ������ ���� �ٸ��� �����
	
		System.out.println("a" == "a"); // ���� �̰� ����
		System.out.println(new String("a") == new String("a")); // �̰� �ٸ�
		
	}

}
