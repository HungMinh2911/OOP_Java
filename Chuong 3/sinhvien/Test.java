package sinhvien;

public class Test {
	public static void main(String [] args)
	{
	Truong a= new Truong("a","b","c");
	SinhVien b= new SinhVien("d",20,'e',"f","g",a);
	System.out.println(b);
	}
}
