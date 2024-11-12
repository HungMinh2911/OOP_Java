package daihoc;
import java.util.*;

public abstract  class  GiangVien {
	protected String hoTen;
	protected String diaChi;
	protected String loaiGiangVien;
	public GiangVien() {
		super();
	}
	public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVien = loaiGiangVien;
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
	public String getLoaiGiangVien() {
		return loaiGiangVien;
	}
	public void setLoaiGiangVien(String loaiGiangVien) {
		this.loaiGiangVien = loaiGiangVien;
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.err.print("Ho va ten: ");
		this.hoTen=sc.nextLine();
		System.out.print("Dia chi: ");
		this.diaChi=sc.nextLine();
		System.out.print("Loai giang vien: ");
		this.loaiGiangVien=sc.nextLine();
	}
	public abstract double tinhLuong() ;
	@Override
	public String toString() {
		return "GiangVien [hoTen=" + hoTen + ", diaChi=" + diaChi + ", loaiGiangVien=" + loaiGiangVien +
				". Luong thang: " + tinhLuong() + "]";
	}
	
	
	
}
