package bachuso;

public class BaChuSo {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i / 100; 
			int c = i % 10; 
			int b = i % 100 - c; 
			if (a * a * a + b * b * b * c * c * c < 30) {
				System.out.println(i);
			}
		}
	}
}
