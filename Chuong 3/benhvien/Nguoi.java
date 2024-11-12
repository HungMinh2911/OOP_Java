package benhvien;
import java.util.*;
public class Nguoi {
	protected String ten;
	protected int age;
	protected char gioiTinh;
	public Nguoi() {
		super();
	}
	public Nguoi(String ten, int age, char gioiTinh) {
		super();
		this.ten = ten;
		this.age = age;
		this.gioiTinh = gioiTinh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	@Override
	public String toString() {
		return "Nguoi [ten=" + ten + ", age=" + age + ", gioiTinh=" + gioiTinh + "]";
	}
	
}
