package Assignment_2;

public class Activity5Phone {

	long phoneNo;
	String servProv;
	String numberCharacterCheck;
	
	void dial(long phoneNo) {
		
		// Doesn't add a "0" when printing the number to the console if it is a 1300 or 1800 number
		
		numberCharacterCheck = Long.toString(phoneNo); 
		if (numberCharacterCheck.length() == 10) {
			System.out.println("I am now dialling the number " + phoneNo);
			System.out.println();
		} else {
			
			// Does add a zero for normal landline and mobile numbers
						
			System.out.println("I am now dialling the number 0" + phoneNo);
			System.out.println();
		}
	}
}
