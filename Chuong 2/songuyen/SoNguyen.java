package songuyen;
import java.util.*;
public class SoNguyen {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so nguyen a: ");
		int a = sc.nextInt();
		System.out.println("Nhap so nguyen b: ");
		int b = sc.nextInt();
		
		
		int tong = a + b;
		System.out.println("a + b = "+ tong);
		int hieu = a - b;
		System.out.println("a + b = "+ hieu);
		long tich = 1l * a * b;
		System.out.println("a * b = "+ tich);
		double thuong = 1.0 * a / b;
		System.out.println("a / b = "+ thuong);
		
	}
}
