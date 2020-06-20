import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileInputOutput {

	public static void main(String[] args) throws IOException {

		// ���� ����
		FileOutputStream output = new FileOutputStream("out.txt");
//		output.close(); // �� ������ �����ص� �ǳ� ���� �ʰ� ����ϴ� ��� ���� �߻��� �� ����
		
		// ���Ͽ� ���� ����
		for (int i = 0; i < 11; i++) {
			String data = i + " ��° ���Դϴ�.\r\n"; // \r\n �ٹٲ� ����
			output.write(data.getBytes()); // string bytes�� �ٲ������
		}
		output.close();
		
		FileWriter fw = new FileWriter("out.txt");
		for (int i = 0; i < 11; i++) {
			String data = i + " ��° ���Դϴ�.\r\n"; // \r\n �ٹٲ� ����
			fw.write(data);
		}
		fw.close();
		
		PrintWriter pw = new PrintWriter("out.txt");
		for (int i = 0; i < 11; i++) {
			String data = i + " ��° ���Դϴ�.";
			pw.println(data);
		}
		pw.close();
		
		// ���Ͽ� ���� �߰��ϱ�
		FileWriter fw2 = new FileWriter("out.txt", true); // �ι�° �Ű������� �߰���� ����
		for (int i = 0; i < 11; i++) {
			String data = i + " ��° ���Դϴ�.\r\n"; // \r\n �ٹٲ� ����
			fw2.write(data);
		}
		fw2.close();
		
			// PrintWriter �̿��Ϸ��� FileWriter ��ü�� �־��ָ� ��
		PrintWriter pw2 = new PrintWriter(new FileWriter("out.txt", true));
		for (int i = 0; i < 11; i++) {
			String data = i + " ��° ���Դϴ�.";
			pw2.println(data);
		}
		pw2.close();
		
		//////////////////////////////////////////////////////////////////
		
		// ���� �б�
		byte[] b = new byte[1024];
		FileInputStream input = new FileInputStream("out.txt");
		input.read(b);
		System.out.println(new String(b));
		input.close();
			
			// ������ ���δ����� �б�
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			System.out.println(line);
		}
		br.close();
		
	}

}
