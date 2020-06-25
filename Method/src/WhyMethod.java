import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {
		
		// 1000000000 1억
//		System.out.println("-");
//		System.out.println("B"); // A로 바꾸려면 밑에도 다꿔줘야된다고 가정
//		System.out.println("B");
//		printTwoTimesB();
//		// 1000000000
//		System.out.println("-");
//		System.out.println("B");
//		System.out.println("B");
//		printTwoTimesB();
		// 1000000000
//		System.out.println("-");
//		System.out.println("B");
//		System.out.println("B");
//		printTwoTimesB();
//		
//		// Refactor로 한번에 method로 만들 수 있음
//		printTwoTimesA();
//		printTwoTimesA();
//		printTwoTimesA();
//		
//		printTwoTimes("a");
//		printTwoTimes("a");
//		printTwoTimes("a");
//		printTwoTimes("b");
//						// 인자, argument
//		printTwoTimes("a", "-");
//		printTwoTimes("a", "*");
//		printTwoTimes("a", "&");
//		printTwoTimes("a", "!");
		
		System.out.println(twoTimes("a", "-"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "-"));
		fw.close();
		
//		Email.send("egoing@a.com", "two times a", twoTimes("a", "&"));
		
		//writeFileTwoTimes("a", "*");
	}

	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	
	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		fw.write(delimiter +"\n");
		fw.write(text +"\n");
		fw.write(text +"\n");
		fw.close();
	}

	// delimiter 구분 문자					// 매개변수, parameter
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

	public static void printTwoTimes(String text) {
		System.out.println("-");
		System.out.println(text);
		System.out.println(text);
	}

	public static void printTwoTimesA() {
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
	}

	public static void printTwoTimesB() {
		System.out.println("-");
		System.out.println("B");
		System.out.println("B");
	}
}
