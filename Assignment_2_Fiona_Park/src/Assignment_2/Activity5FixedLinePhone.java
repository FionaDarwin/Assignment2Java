package Assignment_2;

public class Activity5FixedLinePhone extends Activity5Phone {

	void checkNumberType(String number) {
	
		if (number.charAt(0) == '0') {
			System.out.println("I see that this is a fixed line telephone number.");
			System.out.println();
			System.out.println("The area code of this fixed line number is " + number.charAt(0) + number.charAt(1));	
		}	else if (number.charAt(1) == '8') {
				System.out.println("I see that this is a FreeCall 1800 telephone number.");
			} else if (number.charAt(1) == '3') {
				System.out.println("I see that this is a priority 1300 telephone number.");
			}
			
	}

}
