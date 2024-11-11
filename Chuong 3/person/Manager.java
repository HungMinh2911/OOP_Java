package person;

import java.util.ArrayList;
import java.util.*;
public class Manager {
	private ArrayList<PartTimeEmployee> tmp;
	public Manager()
	{
		tmp=new ArrayList<PartTimeEmployee>();
	}
	public void nhap()
	{
		PartTimeEmployee nv= new PartTimeEmployee();
		nv.nhap();
		tmp.add(nv);
	}
	public void in()
	{
		for(PartTimeEmployee nv: tmp)
		{
			nv.toString();
		}
	}
	public void search(String code)
	{
		boolean check= false;
		for(PartTimeEmployee nv: tmp)
		{
			if(nv.getEmployeeID().equalsIgnoreCase(code))
			{
				nv.toString();
				check=true;
				break;
			}
		}
		if(!check)
		{
			System.err.println("Ko tim thay");
		}
	}
	public void delete(String code)
	{
		boolean check= false;
		for(PartTimeEmployee nv: tmp)
		{
			if(nv.getEmployeeID().equalsIgnoreCase(code))
			{
				tmp.remove(nv);
				check=true;
				System.err.println("Da xoa");
				break;
			}
		}
		if(!check)
		{
			System.err.println("Ko tim thay nhan vien");
		}
	}
	public void sapxepTuoi()
	{
		for(int i=0;i<tmp.size();i++)
		{
			for(int j=i+1;j<tmp.size();j++)
			{
				if(tmp.get(i).getAge()>tmp.get(j).getAge())
				{
					PartTimeEmployee w= tmp.get(i);
					tmp.set(i, tmp.get(j));
					tmp.set(j, w);
				}
			}
		}
	}
	public void sapxepTen()
	{
		Collections.sort(tmp, Comparator.comparing(Person::getName));	}
	public void menu()
	{
		while(true)
		{
			System.err.println("1.Them nhan vien");
			System.err.println("2.In nhan vien");
			System.err.println("3.Xoa theo ID");
			System.err.println("4.Sap xep theo tuoi");
			System.err.println("5.Sap xep theo ten");
			System.err.println("6.Thoat chuong trinh");
			System.err.print("Chon: ");
			Scanner sc= new Scanner(System.in);
			int chon=sc.nextInt();
			sc.nextLine();
			switch(chon)
			{
			case 1:
				nhap();
				break;
			case 2:
				in();
				break;
			case 3:
				System.err.print("Nhap id: ");
				String code=sc.nextLine();
				delete(code);
				break;
			case 4:
				sapxepTuoi(); break;
			case 5:
				sapxepTen(); break;
			case 6:
				return;
			default:
				System.err.println("Nhap so ko hop le");
			}
		}
	}
	
}
