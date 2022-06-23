package Assignment_2;

public class Activity5MobilePhone extends Activity5Phone {

	int batteryDuration;

	void sendTextMessage(long number, String message) {
		System.out.println("I see that this is a mobile phone.");
		System.out.println();
		System.out.println("I'm sending the message " + message + " to 0" + number);
	}
}
