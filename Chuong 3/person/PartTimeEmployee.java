package person;
import java.util.*;
public class PartTimeEmployee  extends Employee {
	protected int hoursPerWeek;

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(String name, int age, char gender, String employeeID, String dateHired, int hoursPerWeek) {
		super(name, age, gender, employeeID, dateHired);
		this.hoursPerWeek = hoursPerWeek;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public String toString() {
		return  super.toString()+ ", PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + "]";
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.err.print("So gio lam 1 tuan: ");
		this.hoursPerWeek=sc.nextInt();
		sc.nextLine();
	}
}
