package caodang;
import java.util.*;
public abstract  class Nguoi {
	protected String hoTen;
	protected String ngaySinh;
	protected String diaChi;
	protected String loaiSinhVien;
	public Nguoi() {
		super();
	}
	public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.loaiSinhVien = loaiSinhVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getLoaiSinhVien() {
		return loaiSinhVien;
	}
	public void setLoaiSinhVien(String loaiSinhVien) {
		this.loaiSinhVien = loaiSinhVien;
	}
	@Override
	public String toString() {
		return "Nguoi [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", loaiSinhVien="
				+ loaiSinhVien +", Diem: "+tinhDiem() +"]";
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Ho va ten: ");
		this.hoTen=sc.nextLine();
		System.out.print("Ngay sinh: ");
		this.ngaySinh=sc.nextLine();
		System.out.print("Dia chi: ");
		this.diaChi=sc.nextLine();
		System.out.print("Loai sinh vien:");
		this.loaiSinhVien=sc.nextLine();
	}
	public abstract double tinhDiem();
	
}
