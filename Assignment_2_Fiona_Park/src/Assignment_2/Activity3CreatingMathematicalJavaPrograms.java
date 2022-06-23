package Assignment_2;

import java.util.Scanner;

public class Activity3CreatingMathematicalJavaPrograms {
	
	public static void main(String[] args) {

		/*this part of the program asks the user to enter two decimal numbers
		if both numbers are less than 20, the code will add them and print the
		result*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first decimal number");
		double firstDecimal = input.nextDouble();
		
		System.out.println("Please enter the second decimal number");
		double secondDecimal = input.nextDouble();
		
		if (firstDecimal < 20 && secondDecimal < 20) {
			System.out.println("The sum of these numbers is " + (firstDecimal + secondDecimal));
		} else {
				System.out.println("I'm sorry, I am instructed not to print a result unless each number that you input is less than 20");
		}
		System.out.println();
		
		//this part of the program finds the sum of all even numbers from 1 to 50
		 
		int sumOfEvens = 0;
		
		for (int i = 0; i < 51; i++) {
			if (i % 2 == 0) {
				sumOfEvens = sumOfEvens + i;			
			}
		}
		
		System.out.println("The sum of even numbers from 1 to 50 is " + sumOfEvens);
		System.out.println();
		
		/*this part of the program declares an array, initialises it,
		 finds the maximum, minimum and range of the contents*/
		
		double[] anArray = {16, 67, 65, 45, 32, 19, 86, 54, 34, 21};

		double maxArrayElement = 0;
			for(int i = 0; i < anArray.length; i ++) {
				if (anArray[i] > maxArrayElement) {
					maxArrayElement = anArray[i];
				}
			}
			System.out.println("The maximum element in the array is " + maxArrayElement);
		
		
		double minArrayElement = Double.MAX_VALUE;
			for(int i = 0; i < anArray.length; i ++) {
				if (anArray[i] < minArrayElement) {
					minArrayElement = anArray[i];
				}	
			}
			System.out.println("The minimum element in the array is " + minArrayElement);
		
			System.out.println("And the range is " + (maxArrayElement - minArrayElement));
			System.out.println();
			
		/*this part of the program declares an array and initialises it, then asks the user to enter
		a value. If the value is not present in the array, a message is printed*/
			
		int[] anotherArray = {45, 32, 78, 65, 43};
		boolean isItPresent = false;
		
		System.out.println("Please enter an integer");
		int usersGuess = input.nextInt();
		
		for (int j = 0; j < anotherArray.length; j++) {
			if (usersGuess == anotherArray[j]) {
				isItPresent = true;
				break;
			}	
		}
		
		if (isItPresent == false) {
			System.out.println("I'm sorry, that number is not in the array.");
		}
		
		input.close();	
		
		System.out.println("That's the end of the program. Thank you.");
	}

}

