import java.util.Random;

public class RandomPractice {

	public static void main(String[] args) {

		Random rd = new Random();

		for (int i = 0; i < 40; i++) {
			System.out.println("[" + (rd.nextInt(40) + 1) + "]");
		}

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };

		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			int x = rd.nextInt(a.length);
			int y = rd.nextInt(a.length);
			int temp = a[x];
			a[x] = a[y];
			a[y] = temp;
		}

		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
