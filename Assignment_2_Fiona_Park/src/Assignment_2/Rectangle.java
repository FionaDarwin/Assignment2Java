package Assignment_2;

public class Rectangle {
	
	public static void printArea(double width, double length) {
		
		double rectArea = length * width;
		System.out.println("The area of this rectangle is " + rectArea + " units");
		
	}

	public static void printPerimeter(double width, double length) {
		
		double rectPerimeter = 2 * (length + width);
		System.out.println("The perimeter of this rectangle is " + rectPerimeter + " units");
		
	}
	

}
	


