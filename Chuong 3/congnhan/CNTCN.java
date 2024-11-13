package congnhan;

import java.util.Scanner;

public class CNTCN extends CongNhan {
	private int luongCB;
	private int heSOL;
	private int soNgay;
	public CNTCN()
	{
		this.loaiCongNhan="CNTCN";
	}
	
	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	public int getLuongCB() {
		return luongCB;
	}

	public void setLuongCB(int luongCB) {
		this.luongCB = luongCB;
	}

	public int getHeSOL() {
		return heSOL;
	}

	public void setHeSOL(int heSOL) {
		this.heSOL = heSOL;
	}

	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.err.print("Luong CB: ");
		this.luongCB=sc.nextInt();
		System.out.print("He so Luong: ");
		this.heSOL=sc.nextInt();
	}
	public double tinhLuong()
	{
		double thuong;
		if(getSoNgay()>=20)
		{
			thuong=1.2*getLuongCB();
		}
		else
		{
			thuong=0;
		}
		return getLuongCB()*getHeSOL()+thuong;
	}
}
