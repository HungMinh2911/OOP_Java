package shape;

public class Triangle  extends Shape{
	private int base;
	private int height;
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	public double getArea()
	{
		return (base*height)*1/2;
	}
	public String toString()
	{
		return "Chieu cao: "+base+" Chieu cao:"+height+" Mau sac: "+color;
	}
	
}
