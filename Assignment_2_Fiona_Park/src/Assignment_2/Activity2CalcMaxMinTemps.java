package Assignment_2;

//this class holds a method that calculates and prints the week's maximum and minimum temperatures

public class Activity2CalcMaxMinTemps {

	void calcMaxTemp(int [] array, String location) {
		int maxTemp = 0;
		for(int i = 0; i < array.length; i ++) {
			if (array[i] > maxTemp) {
				maxTemp = array[i];
			}
		}
		System.out.println("The maximum temperature this week in " + location + " was " + maxTemp + " degrees C");
	}
	
	void calcMinTemp(int [] array, String location) {
		int minTemp = 100;
		for(int i = 0; i < array.length; i ++) {
			if (array[i] < minTemp) {
				minTemp = array[i];
			}
		}
		System.out.println("The minimum temperature this week in " + location + " was " + minTemp + " degrees C");
	}
}	

	


