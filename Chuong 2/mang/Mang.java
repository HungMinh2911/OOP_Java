package mang;
import java.util.*;
public class Mang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		System.out.println("Mang vua nhap : ");
		for (int i : a) {
			System.out.print(i + " ");
		}

	}
}
