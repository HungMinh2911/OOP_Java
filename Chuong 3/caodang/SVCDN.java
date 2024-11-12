package caodang;
import java.nio.channels.AlreadyBoundException;
import java.util.*;
public class SVCDN  extends Nguoi{
	protected int TDKT;
	protected int SMKT;
	public SVCDN() {
		this.loaiSinhVien="SVCDN";
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.println("TDKT: ");
		this.TDKT=sc.nextInt();
		System.out.print("SMKT: ");
		this.SMKT=sc.nextInt();
		
	}
	@Override
	public String toString() {
		return super.toString()+ " SVCDN [TDKT=" + TDKT + ", SMKT=" + SMKT + "]";
	}
	public int getTDKT() {
		return TDKT;
	}
	public void setTDKT(int tDKT) {
		TDKT = tDKT;
	}
	public int getSMKT() {
		return SMKT;
	}
	public void setSMKT(int sMKT) {
		SMKT = sMKT;
	}
	public double tinhDiem() {
		double diem=0;
		try {
			diem=getTDKT()/getSMKT();
		}
		catch(ArithmeticException a)
		{
			System.out.println("Vui long nhap so mon ktr >0");
			Scanner sc= new Scanner(System.in);
			while(SMKT<=0)
			{
				System.out.print("SMKT= ");
				this.SMKT=sc.nextInt();
			}
			diem=getTDKT()/getSMKT();
		}
		return diem;
	}
}
