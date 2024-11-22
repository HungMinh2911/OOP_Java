package bit;

public class Bit {
	public static void main(String[] args) {

		
		int a = 10;
		int b = 100;
		int kq;
		
		System.out.println("Phan a");
		kq = a | b;
		System.out.println("ket qua = " + kq); 

		// phan b
		System.out.println("Phan b");
		kq = a & b;
		System.out.println("ket qua = " + kq); 

		// phan c
		System.out.println("Phan c");
		kq = a ^ b; /
		System.out.println("ket qua = " + kq); 

		// phan d
		System.out.println("Phan d");
		kq = ~a; // phu dinh a
		System.out.println("ket qua = " + kq); 

		// phan e
		System.out.println("Phan e");
		kq = a >> 2; 
		System.out.println("ket qua = " + kq);

		// phan f
		System.out.println("Phan f");
		kq = b << 2; 
		System.out.println("ket qua = " + kq);

	}
}
