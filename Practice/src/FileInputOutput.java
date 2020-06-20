import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileInputOutput {

	public static void main(String[] args) throws IOException {

		// 파일 쓰기
		FileOutputStream output = new FileOutputStream("out.txt");
//		output.close(); // 이 문장은 생략해도 되나 닫지 않고 사용하는 경우 에러 발생할 수 있음
		
		// 파일에 내용 쓰기
		for (int i = 0; i < 11; i++) {
			String data = i + " 번째 줄입니다.\r\n"; // \r\n 줄바꿈 문자
			output.write(data.getBytes()); // string bytes로 바꿔줘야함
		}
		output.close();
		
		FileWriter fw = new FileWriter("out.txt");
		for (int i = 0; i < 11; i++) {
			String data = i + " 번째 줄입니다.\r\n"; // \r\n 줄바꿈 문자
			fw.write(data);
		}
		fw.close();
		
		PrintWriter pw = new PrintWriter("out.txt");
		for (int i = 0; i < 11; i++) {
			String data = i + " 번째 줄입니다.";
			pw.println(data);
		}
		pw.close();
		
		// 파일에 내용 추가하기
		FileWriter fw2 = new FileWriter("out.txt", true); // 두번째 매개변수가 추가모드 구분
		for (int i = 0; i < 11; i++) {
			String data = i + " 번째 줄입니다.\r\n"; // \r\n 줄바꿈 문자
			fw2.write(data);
		}
		fw2.close();
		
			// PrintWriter 이용하려면 FileWriter 객체를 넣어주면 됨
		PrintWriter pw2 = new PrintWriter(new FileWriter("out.txt", true));
		for (int i = 0; i < 11; i++) {
			String data = i + " 번째 줄입니다.";
			pw2.println(data);
		}
		pw2.close();
		
		//////////////////////////////////////////////////////////////////
		
		// 파일 읽기
		byte[] b = new byte[1024];
		FileInputStream input = new FileInputStream("out.txt");
		input.read(b);
		System.out.println(new String(b));
		input.close();
			
			// 파일을 라인단위오 읽기
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			System.out.println(line);
		}
		br.close();
		
	}

}
