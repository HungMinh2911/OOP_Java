package hocvien;
import java.util.*;
public   class HocVienDH extends HocVIen {
	private int soBuoi;
	private int donGia;
	public HocVienDH()
	{
		this.loaiChuongTrinh="HocVienDH";
	}
	public int getSoBuoi() {
		return soBuoi;
	}
	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
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
		System.out.print("So buoi: ");
		this.soBuoi=sc.nextInt();
		System.out.println("Don gia: ");
		this.donGia=sc.nextInt();
	}
	@Override
	public String toString() {
		return super.toString();
	}
	public double hocPhi()
	{
		double uuTien=0;
		switch (getLoaiUuTien())
		{
		case 1:
			uuTien=1000000;
			break;
		case 2:
			uuTien=500000;
			break;
		default:
			break;
		}
		return soBuoi*donGia-uuTien;
	}
	
}
