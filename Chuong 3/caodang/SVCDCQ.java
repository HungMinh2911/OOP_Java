package caodang;

import java.util.Scanner;

public class SVCDCQ extends Nguoi {
	protected int TDKT;
	protected int SMKT;
	protected double DTKTHP;
	public SVCDCQ()
	{
		this.loaiSinhVien="SVCDCQ";
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
	public double getDTKTHP() {
		return DTKTHP;
	}
	public void setDTKTHP(double dTKTHP) {
		DTKTHP = dTKTHP;
	}
	@Override
	public String toString() {
		return super.toString()+ ", SVCDCQ [TDKT=" + TDKT + ", SMKT=" + SMKT + ", DTKTHP=" + DTKTHP + "]";
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.println("TDKT: ");
		this.TDKT=sc.nextInt();
		System.out.print("SMKT: ");
		this.SMKT=sc.nextInt();
		System.out.println("DTKTHP: ");
		this.DTKTHP=sc.nextDouble();
	}
	public double tinhDiem()
	{
		double diem=0;
		try {
			diem=(getTDKT()/getSMKT() +getDTKTHP())/3;
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
			diem=(getTDKT()/getSMKT() +getDTKTHP())/3;
		}
		return diem;
	}
	
}
