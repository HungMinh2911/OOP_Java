package sv_diem;
import java.util.*;
public class XepDiem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Nhap so sinh vien :");
		int n = sc.nextInt();
		// nhap diem sinh vien
		int[] diem = new int[n];
		System.out.println("Nhap diem cho " + n + " sinh vien  : ");
		for (int i = 0; i < n; i++) {
			System.out.print("diem sinh vien thu " + (i + 1) + " :");
			diem[i] = sc.nextInt();
		}
		Arrays.sort(diem); 
		System.out.println("Diem cao nhat: " + diem[n - 1]);
		System.out.println("Danh sach diem tang dan : ");
		for (int i : diem) {
			System.out.print(i + " ");
		}

	}

}
