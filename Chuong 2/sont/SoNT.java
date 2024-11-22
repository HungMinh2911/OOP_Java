package sont;
import java.util.*;
public class SoNT {
	public static boolean check(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Nhap 1 so nguyen : ");
		int n = sc.nextInt();
	
		if (SoNT.check(n)) {
			System.out.println("So nguyen vua nhap la so nguyen to");
		} else {
			System.out.println("So nguyen vua nhap khong phai so nguyen to");
		}
	}

}
