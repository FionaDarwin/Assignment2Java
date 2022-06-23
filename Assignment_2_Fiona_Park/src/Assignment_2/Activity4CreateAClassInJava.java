package Assignment_2;

import java.util.Scanner;

public class Activity4CreateAClassInJava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* This part of the program asks the user to choose to do caculations
		 on either a circle or a rectangle */
		
		System.out.println("Would you like to perform calculations for a circle or for a rectangle?");
		System.out.println("If circle enter: c | if rectangle enter: r");
		char choiceOfShape = scanner.next().charAt(0); 

		/* This part of the program asks for relevant measurements then uses methods in the
		'Rectangle' class to calculate area and perimeter */
		
		if (choiceOfShape == 'r' || choiceOfShape == 'R') {
			System.out.println("You chose rectangle. Let's do some calculations for that rectangle.");
			System.out.println();
			System.out.println("What is the length of the rectangle");
			double length = scanner.nextDouble();
			System.out.println("What is the width of the rectangle");
			double width = scanner.nextDouble();
			System.out.println();
			Rectangle.printArea(width, length);
			Rectangle.printPerimeter(width, length);
			
			/* This part of the program asks for a relevant measurement then uses methods in the
			 'Circle' class to calculate area and perimeter */
			
		} else if (choiceOfShape == 'c' || choiceOfShape == 'C') {
			System.out.println("You chose circle. Let's do some calculations for that circle.");
			System.out.println();
			System.out.println("What is the diameter of the circle?");
			double diameter = scanner.nextDouble();
			Circle.printArea(diameter);
			Circle.printPerimeter(diameter);
		} else {
			System.out.println("That's not a valid choice. Goodbye.");
		}
		
		scanner.close();
		
	}	
}
