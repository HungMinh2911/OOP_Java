package daihoc;
import java.util.*;
public class GVCoHuu extends GiangVien {
	private int luongCoBan;
	private double heSoLuong;
	private int thamNien;
	public GVCoHuu() {
		this.loaiGiangVien="Giao vien Co Huu";
	}
	
	public int getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(int luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public int getThamNien() {
		return thamNien;
	}
	public void setThamNien(int thamNien) {
		this.thamNien = thamNien;
	}
	@Override
	public String toString() {
		return super.toString()+ ", GVCoHuu [luongCoBan=" + luongCoBan + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + "]";
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.print("Luong co ban: ");
		this.luongCoBan=sc.nextInt();
		System.err.print("He so luong: ");
		this.heSoLuong=sc.nextDouble();
		System.err.print("Tham nien: ");
		this.thamNien=sc.nextInt();
		
	}
	public double tinhLuong()
	{
		double phuCap=0;
		if(getThamNien()>=5)
		{
			phuCap=(double)getLuongCoBan()*getThamNien();
		}
		return getLuongCoBan()*getHeSoLuong()+phuCap;
	}
	

	
}
