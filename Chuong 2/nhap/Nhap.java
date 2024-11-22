package nhap;
import java.util.*;
public class Nhap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap mot so nguyen: ");
		int i = sc.nextInt();
		System.out.println("So nguyen vua nhap: " + i);

		
		System.out.println("Nhap mot so thuc: ");
		double d = sc.nextDouble();
		System.out.println("So thuc vua nhap: " + d);

		
		System.out.println("Nhap mot ki tu: ");
		char c = sc.next().charAt(0);
		System.out.println("Ki tu vua nhap: " + c);

		
		System.out.println("Nhap mot chuoi ki tu: ");
		String s = sc.next();
		System.out.println("Chuoi ki tu vua nhap: " + s);

	}
}
