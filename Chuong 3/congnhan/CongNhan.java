package congnhan;
import java.util.*;

public  abstract class CongNhan {
	protected String name;
	protected String diaChi;
	protected String loaiCongNhan;
	public CongNhan() {
		super();
	}
	public CongNhan(String name, String diaChi, String loaiCongNhan) {
		super();
		this.name = name;
		this.diaChi = diaChi;
		this.loaiCongNhan = loaiCongNhan;
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
	public String getLoaiCongNhan() {
		return loaiCongNhan;
	}
	public void setLoaiCongNhan(String loaiCongNhan) {
		this.loaiCongNhan = loaiCongNhan;
	}
	@Override
	public String toString() {
		return "CongNhan [name=" + name + ", diaChi=" + diaChi + ", loaiCongNhan=" + loaiCongNhan + "]";
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Ho va ten: ");
		this.name=sc.nextLine();
		System.out.print("Dia chi: ");
		this.diaChi=sc.nextLine();
		System.err.print("Loai Cong Nhan: ");
		this.loaiCongNhan=sc.nextLine();
	}
	public abstract double  tinhLuong();
	
}
