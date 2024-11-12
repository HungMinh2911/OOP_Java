package kisu;
import java.util.*;
public class LDPT extends NguoiLaoDong {
	private int soNgayCong;
	private int donGiaNgayCong;
	public LDPT() {
		this.loaiLaoDong="LDPT";
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public int getDonGiaNgayCong() {
		return donGiaNgayCong;
	}
	public void setDonGiaNgayCong(int donGiaNgayCong) {
		this.donGiaNgayCong = donGiaNgayCong;
	}
	@Override
	public String toString() {
		return super.toString()+" LDPT [soNgayCong=" + soNgayCong + ", donGiaNgayCong=" + donGiaNgayCong + "]";
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.print("So ngay cong: ");
		this.soNgayCong=sc.nextInt();
		System.out.print("Don gia ngay cong: ");
		this.donGiaNgayCong=sc.nextInt();
	}
	public double tinhLuong()
	{
		int thuong;
		double luong;
		if(getSoNgayCong()<0 &&getSoNgayCong()<=15)
		{
			thuong =000000;
		}
		else if(getSoNgayCong()<25)
		{
			thuong=700000;
		}
		else
		{	thuong=1000000;
		}
		luong=getDonGiaNgayCong()*getSoNgayCong()+thuong;
		return luong;

	}
	
	
}
