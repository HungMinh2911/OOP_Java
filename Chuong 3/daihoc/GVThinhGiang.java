package daihoc;
import java.util.*;
public  class GVThinhGiang extends GiangVien {

	private int soTiet;
	private int donGia;
	public GVThinhGiang() {
		this.loaiGiangVien="Giao vien thinh giang";
	}
	
	public int getSoTiet() {
		return soTiet;
	}
	public void setSoTiet(int soTiet) {
		this.soTiet = soTiet;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	@Override
	public String toString() {
		return  super.toString()+ ", GVThinhGiang [soTiet=" + soTiet + ", donGia=" + donGia + "]";
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.print("So tiet day: ");
		this.soTiet=sc.nextInt();
		System.err.print("Don gia: ");
		this.donGia=sc.nextInt();
		
	}
	public double tinhLuong()
	{
		double thuNhap=0.15*(getSoTiet()*getDonGia());
		return getDonGia()*getSoTiet()-thuNhap;
		
	}
	
}
