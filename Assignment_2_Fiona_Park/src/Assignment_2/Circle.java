package Assignment_2;

public class Circle {
	
	public static void printArea(double diameter) {
		double circleArea = Math.PI * ((diameter / 2) * (diameter / 2));
		System.out.println("The area of this circle is " + circleArea + " units");
		}

	public static void printPerimeter(double diameter) {
		double circlePerimeter = Math.PI * diameter;
		System.out.println("The area of this circle is " + circlePerimeter + " units");
		}
}
