
import java.util.Scanner;

public class HealthyHearts {

	public static void main(String[] args) {
		int MAX_HEART_RATE = 220;
		float MIN_HEART_RATE_ZONE = 0.5f;
		float MAX_HEART_RATE_ZONE = 0.85f;
		
		System.out.println("What is your age?");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.nextLine(); // consume \n 
		
		System.out.println("Your maximum heart rate should be " + (MAX_HEART_RATE - age) + " beats per minute");
		
		int minHeartRate =  (int)  ((MAX_HEART_RATE - age) * MIN_HEART_RATE_ZONE);
		int maxHeartRate =  (int) Math.round((MAX_HEART_RATE - age) * MAX_HEART_RATE_ZONE);
		
		System.out.println("Your target HR Zone is " + minHeartRate + " - " + maxHeartRate + " beats per minute");
	}

}
