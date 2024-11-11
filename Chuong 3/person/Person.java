package person;
import java.util.*;
public class Person {
	protected String name;
	protected int age;
	protected char gender;
	public Person() {
		super();
	}
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public  void nhap()
	{
		Scanner sc= new Scanner(System.in);
		System.err.print("Ho va ten: ");
		this.name=sc.nextLine();
		System.err.print("Tuoi: ");
		this.age=sc.nextInt();
		sc.nextLine();
		System.err.print("Gioi tinh: ");
		this.gender=sc.next().charAt(0);
	}
	
	
}

