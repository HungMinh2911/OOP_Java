package kisu;
import java.util.*;
public  abstract class NguoiLaoDong {
	protected String hoTen;
	protected String diaChi;
	protected String loaiLaoDong;
	public NguoiLaoDong() {
		super();
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getLoaiLaoDong() {
		return loaiLaoDong;
	}
	public void setLoaiLaoDong(String loaiLaoDong) {
		this.loaiLaoDong = loaiLaoDong;
	}
	@Override
	public String toString() {
		return "NguoiLaoDong [hoTen=" + hoTen + ", diaChi=" + diaChi + ", loaiLaoDong=" + loaiLaoDong + "Luong thang: "+tinhLuong()+ "]";
	}
	public abstract double tinhLuong();
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Ho va ten: ");
		this.hoTen=sc.nextLine();
		System.out.print("Dia chi: ");
		this.diaChi=sc.nextLine();
		System.out.print("Loai lao dong: ");
		this.loaiLaoDong=sc.nextLine();

		
	}
	
	
}
