package hocvien;
import java.util.*;
public abstract  class HocVIen {
	protected String name;
	protected String diaChi;
	protected String loaiChuongTrinh;
	protected int loaiUuTien;
	public HocVIen() {
		super();
	}
	public HocVIen(String name, String diaChi, String loaiChuongTrinh) {
		super();
		this.name = name;
		this.diaChi = diaChi;
		this.loaiChuongTrinh = loaiChuongTrinh;
	}
	public int getLoaiUuTien() {
		return loaiUuTien;
	}
	public void setLoaiUuTien(int loaiUuTien) {
		this.loaiUuTien = loaiUuTien;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getLoaiChuongTrinh() {
		return loaiChuongTrinh;
	}
	public void setLoaiChuongTrinh(String loaiChuongTrinh) {
		this.loaiChuongTrinh = loaiChuongTrinh;
	}
	@Override
	public String toString() {
		return "HocVIen [name=" + name + ", diaChi=" + diaChi + ", loaiChuongTrinh=" + loaiChuongTrinh + "]";
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Ho va ten: ");
		this.name=sc.nextLine();
		System.out.print("Dia chi: ");
		this.diaChi=sc.nextLine();
		System.out.print("Loai chuong trinh: ");
		this.loaiChuongTrinh=sc.nextLine();
		
	}
	public abstract double hocPhi();
	
	
}
