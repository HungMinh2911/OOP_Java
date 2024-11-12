package benhvien;

public class Test {
 public static void main(String [] args)
 {
	 Nguoi a= new Nguoi ("a",4,'N');
	 BenhVien b= new BenhVien("b","c","d");
	 BenhNhan w= new BenhNhan("a",4,'N',"e","f",b);
	 System.err.println(b);
	 
 }
}
