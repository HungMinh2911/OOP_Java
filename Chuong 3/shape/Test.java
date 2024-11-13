package shape;

public class Test {
	 public static void main(String[] args) {
	        Shape[] shapes = new Shape[4];
	        shapes[0] = new Rectangle("Green", 10, 4);
	        shapes[1] = new Triangle("Yellow", 6, 7);
	        shapes[2] = new Rectangle("Blue", 8, 3);
	        shapes[3] = new Triangle("Purple", 5, 9);

	        for (Shape shape : shapes) {
	            if (shape instanceof Rectangle) {
	                System.out.println("Rectangle: " + shape + ", Area: " + shape.getArea());
	            } else if (shape instanceof Triangle) {
	                System.out.println("Triangle: " + shape + ", Area: " + shape.getArea());
	            }
	        }
	    }
}
