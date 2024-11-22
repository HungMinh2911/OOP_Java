package time;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		try {
            
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ngay :");
			int ngay = sc.nextInt();
			System.out.println("Nhap thang : ");
			int thang = sc.nextInt();
			System.out.println("Nhap nam : ");
			int nam = sc.nextInt();
            ThoiGian thoiGian = new ThoiGian(ngay, thang, nam); 
            System.out.println(thoiGian);
        } catch (InvalidDateException e) {
          
            System.out.println("Lỗi: " + e.getMessage());
        }
	}
}
