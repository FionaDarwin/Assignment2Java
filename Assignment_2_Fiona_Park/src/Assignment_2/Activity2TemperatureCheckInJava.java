package Assignment_2;

import java.util.Scanner;

/**this class holds the main() method. It collects user input in the form of
 * the temperatures for seven days of the week, stores the temperatures in an array,
 * then creates objects of methods calcMaxTemp(), calcMinTemp() and calcAvgTemp() 
 * which are held in two other classes. The main() method in this class calls these three
 * other methods on the objects
 */

public class Activity2TemperatureCheckInJava {

	public static void main(String[] args) {
		
		int[] storeTemperatures = new int[7];
		String placeName;
		
		String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i <= 6; i++) {
			System.out.println("Enter the temperature in degrees C to the nearest whole number for " + daysOfWeek[i]);
			storeTemperatures[i] = input.nextInt();
		}
		
		System.out.println();
		System.out.println("In what suburb were those temperatures recorded this week?");
		placeName = input.next();
		System.out.println();
		
		Activity2CalcMaxMinTemps a = new Activity2CalcMaxMinTemps();
		Activity2CalcAvgTemp b = new Activity2CalcAvgTemp();
		a.calcMaxTemp(storeTemperatures, placeName);	
		a.calcMinTemp(storeTemperatures, placeName);
		b.calcAvgTemp(storeTemperatures, placeName);

		input.close();
	}

}

