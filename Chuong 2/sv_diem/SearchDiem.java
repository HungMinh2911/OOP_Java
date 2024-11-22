package sv_diem;
import java.util.*;
public class SearchDiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		System.out.println("Nhap so sinh vien: ");
		int n = sc.nextInt();
		int[] ds = new int[n];
		System.out.println("Nhap danh sach diem cho " + n + " sinh vien (thang diem 100) : ");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap diem sinh vien thu " + (i + 1) + " :");
			ds[i] = sc.nextInt();
		}
		System.out.println("Danh sach diem : " + Arrays.toString(ds));
		System.out.println("\nNhap diem muon tim : ");
		int diem = sc.nextInt();

		
		Arrays.sort(ds);
		int check = Arrays.binarySearch(ds, diem);
		if (check >= 0) {
			System.out.println(" co diem can tim");
		} else
			System.out.println(" khong co diem can tim");
		;

	}

}
