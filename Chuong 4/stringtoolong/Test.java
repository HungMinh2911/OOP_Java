package stringtoolong;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các chuỗi ký tự (nhập 'DONE' để kết thúc):");

        while (true) {
            try {
                System.out.print("Nhập chuỗi: ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("DONE")) {
                    System.out.println("Kết thúc chương trình.");
                    break;
                }

                if (input.length() > 30) {
                    throw new StringTooLongException("Chuỗi nhập quá 30 ký tự: \"" + input + "\"");
                }

                System.out.println("Chuỗi hợp lệ: " + input);
            } catch (StringTooLongException e) {
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Chuong trinh ket thuc !");
                break;
            }
        }

        scanner.close();
    }
}
