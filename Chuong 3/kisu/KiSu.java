package kisu;

import java.util.Scanner;

public class KiSu extends NguoiLaoDong {
	private int luongCoBan;
	private int heSoLuong;
	private int soNgayCong;
	public KiSu() {this.loaiLaoDong="Ki su";}
	public int getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(int luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public int getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	@Override
	public String toString() {
		return "KiSu [luongCoBan=" + luongCoBan + ", heSoLuong=" + heSoLuong + "]";
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.print("So ngay cong: ");
		this.luongCoBan=sc.nextInt();
		System.out.print("Don gia ngay cong: ");
		this.heSoLuong=sc.nextInt();
	}
	public double tinhLuong()
	{
		int thuong;
		double luong;
		if(getSoNgayCong()<0 &&getSoNgayCong()<=15)
		{
			thuong =50000;
		}
		else if(getSoNgayCong()<25)
		{
			thuong=1000000;
		}
		else
		{	thuong=2000000;
		}
		luong=getLuongCoBan()*getHeSoLuong()+thuong;
		return luong;
	}
	
}
