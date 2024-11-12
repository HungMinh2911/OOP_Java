package benhvien;

public class BenhNhan  extends Nguoi{
	private String tienSu;
	private String chuanDoan;
	private BenhVien benhVien;
	public BenhNhan() {
		super();
	}
	public BenhNhan(String ten, int age, char gioiTinh, String tienSu, String chuanDoan, BenhVien benhVien) {
		super(ten, age, gioiTinh);
		this.tienSu = tienSu;
		this.chuanDoan = chuanDoan;
		this.benhVien = benhVien;
	}
	public String getTienSu() {
		return tienSu;
	}
	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}
	public String getChuanDoan() {
		return chuanDoan;
	}
	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}
	public BenhVien getBenhVien() {
		return benhVien;
	}
	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}
	@Override
	public String toString() {
		return "BenhNhan [tienSu=" + tienSu + ", chuanDoan=" + chuanDoan + ", benhVien=" + benhVien + "]";
	}
	
}
