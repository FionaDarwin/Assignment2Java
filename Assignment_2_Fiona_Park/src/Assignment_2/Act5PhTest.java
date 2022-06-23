package Assignment_2;

import java.util.Scanner;

public class Act5PhTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		/* Asks the user to input a number and checks that there are 10 characters.
		 The number is stored as a string */
		
		System.out.println("Please enter the 10 digit phone number without spaces or special characters, (e.g. 0392148444 or 0444111222):");
		System.out.println();
		String inputNumber = scanner.next(); 
		System.out.println();
		
		if (inputNumber.length() != 10) { 
			System.out.println("I'm sorry that number did not have 10 digits. Goodbye.");
			
		} else {
		
			/* If the first two characters of the number are "04", the program detects that it
			is a mobile phone, uses the dial() method in the Activity5Phone class to "dial" the
			number and uses the sendTextMessage() class in the Activity5MobilePhone class
			to send a text message */
			
			if (inputNumber.charAt(0) == '0' && inputNumber.charAt(1) == '4') {

				Activity5MobilePhone m1 = new Activity5MobilePhone();
				m1.phoneNo = Long.parseLong(inputNumber);
				m1.dial(m1.phoneNo);
				m1.sendTextMessage(m1.phoneNo, "\"This is a test SMS message\"");
				
			} else {

				/* If the first two characters of the number are not "04", the program detects that it
				is a landline, and dials the number */
				
				Activity5FixedLinePhone p1 = new Activity5FixedLinePhone();
				p1.phoneNo = Long.parseLong(inputNumber);
				p1.servProv = "Telstra";
		
				p1.checkNumberType(inputNumber);
				System.out.println();
				p1.dial(p1.phoneNo);
				
				
			}

		}
		
		scanner.close();	
	}

}
