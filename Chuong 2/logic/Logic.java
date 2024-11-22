package logic;

public class Logic {
	public static void main(String[] args) {
		// phan a
		System.out.println("Phan a : ");
		boolean a = (2 < 3) || (4 > 3); 
		System.out.println("a = " + a);

		// phan b
		System.out.println("Phan b : ");
		boolean b = (2 < 3) && (4 > 3); 
		System.out.println("b = " + b);

		// phan c
		System.out.println("Phan c : ");
		boolean c = (2 < 3) && (4 < 3); 
		System.out.println("c = " + c);

		// phan d
		System.out.println("Phan d : ");
		boolean d = !(2 > 4); 
		System.out.println("d = " + d);

		// phan e
		System.out.println("Phan d : ");
		boolean e = 2 == 3; 
		System.out.println("e = " + e);

		// phan f
		System.out.println("Phan f : ");
		boolean f = 4 != 3; 
		System.out.println("f = " + f);
	}

}
