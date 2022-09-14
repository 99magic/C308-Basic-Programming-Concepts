import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

	public static void main(String[] args) {
		System.out.println("What is your dog's name?");
		Scanner sc = new Scanner(System.in);
		String dogName = sc.nextLine();
		
		System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here." + System.lineSeparator());
		System.out.println(dogName + " is: " + System.lineSeparator());
		
		String[] breedType = new String[] {"German Shepherd", "Bulldog", "Labrador Retreiver", "Siberian Husky", "Poodle"};
		
		int total = 100;
		int n = breedType.length;
		
		for(int i = 0; i < n; ++i) {
			int random = new Random().nextInt(total);	// 0 - 99
			if((i + 1) == n && total > 0) {
				System.out.println(total + "% " + breedType[i]);
				break;
			}
			total -= random;
			System.out.println(random + "% " + breedType[i]);
		}

		System.out.println(System.lineSeparator() + "Wow, that's QUITE the dog! ");
	}

}
