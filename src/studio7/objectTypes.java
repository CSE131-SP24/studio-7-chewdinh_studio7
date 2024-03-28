package studio7;

public class objectTypes { // RECTANGLESSS
	private double width; 
	private double length;
	
	public objectTypes(double width2, double length2) {
		width = width2; 
		length = length2; 
	}
	public double area() {
		return length * width; 
	}
	public double perimeter() {
		return (length*2) + (width*2); 
	}
	public boolean squareOrRectangle() {
		if (length == width) {
			return true;
		}
		else {
			return false; 
		}
	}
	
	public static void main(String[] args) {
		objectTypes r1 = new objectTypes(3, 5);
		System.out.println(r1.area()); 
		System.out.println(r1.perimeter());
		System.out.println(r1.squareOrRectangle());
		
		
		

	}

}
