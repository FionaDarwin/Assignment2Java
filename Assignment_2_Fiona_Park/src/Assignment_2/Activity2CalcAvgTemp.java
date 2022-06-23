package Assignment_2;

//this class holds a method that calculates and prints the week's average temperature

public class Activity2CalcAvgTemp {

	void calcAvgTemp(int [] array, String location) {
		
		int sum = 0;
	
		//calculate average by calculating sum of all temperatures then dividing it by length of the array
		for (int j = 0; j < array.length; j++) {
			sum = sum + array[j];
		}
	
		int average = sum / array.length;
	
		System.out.println("The average temperature this week in " + location + " was " + average + " degrees C");
	}
}
