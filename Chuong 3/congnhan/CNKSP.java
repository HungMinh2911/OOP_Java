package congnhan;
import java.util.*;
public class CNKSP extends CongNhan {
	private int soSP;
	private int donGia;
	public CNKSP()
	{
		this.loaiCongNhan="CNKSP";
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.err.print("So san pham: ");
		this.soSP=sc.nextInt();
		System.out.print("Don Gia: ");
		this.donGia=sc.nextInt();
	}
	public double tinhLuong()
	{
		double thuong;
		if(getSoSP()>=1150)
		{
			thuong=1500000;
		}
		else if(getSoSP()>=1100)
		{
			thuong=1000000;
		}
		else
		{
			thuong=0;
		}
		return getSoSP()*getDonGia()+thuong;
	}
	
}
