package Assignment_2;

import java.util.Scanner;

/**
 * This application will only complete successfully if the username
 * and password and date of birth entered are each different to the
 * predefined values below
*/

public class Activity1CreateAJavaLogin {

	public static void main(String[] args) {
		// here are the predefined username, password and date of birth values
		
		String validUsername = "test";
		String validPassword = "test";
		String dateOfBirth = "26061985";
		
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		
		do {
			System.out.println("Please enter your username:");
			String username = scanner.next();
			System.out.println("Please enter your password:");
			String password = scanner.next();
			System.out.println("Please enter your date of birth in the format ddmmyyyy:");
			String dob = scanner.next();
			if(!username.equals(validUsername) && !password.equals(validPassword) && !dob.equals(dateOfBirth)) {
				System.out.println("Welcome " + username + "!!");
				flag = true;
			} else {
				System.out.println("The username, password or date of birth are incorrect. Please try again");
			}
		}
		while(flag == false);
		scanner.close();
					
	}

}
