package haisn;
import java.util.*;
public class HaiSN {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Nhập số nguyên thứ nhất: ");
	        int a = scanner.nextInt();
	        
	        System.out.print("Nhập số nguyên thứ hai: ");
	        int b = scanner.nextInt();
	        
	        try {
	            int result = a / b;
	            System.out.println("Kết quả phép chia: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Lỗi: Không thể chia cho 0.");
	        }
	        
	        scanner.close();
	    }
}