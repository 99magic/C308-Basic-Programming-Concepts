import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	public int winCount;
	public int loseCount;
	public int drawCount;

	public static void main(String[] args) {
		System.out.println("Welcome to Rock, Paper, Scissors.");
		System.out.println("How many rounds do you want to play? (1 - 10)");
		Scanner sc = new Scanner(System.in);
		RockPaperScissors rps = new RockPaperScissors();
		
		int rounds = sc.nextInt();
		sc.nextLine(); // consumed \n not consumed by nextInt();
		if(rounds <= 0 || rounds > 10) {
			System.out.println("Error: Please enter between 1 - 10 rounds.");
			System.out.println("Program Closing.");
			sc.close();
			return;
		}
		
		int roundCount = 1;
		
		while(rounds > 0) {
			
			System.out.println("-----Round " + roundCount + "-----");
			System.out.println("Your Wincount: " + rps.winCount);
			System.out.println("Your Drawcount: " + rps.drawCount);
			System.out.println("Your Losecount: " + rps.loseCount);
			System.out.println("Please input your choice.");
			System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
			
			int playerChoice = sc.nextInt();
			sc.nextLine(); // consumed \n not consumed by nextInt();
			if(playerChoice <= 0 || playerChoice > 3) {
				System.out.println("Please enter a valid Input.");
				continue;
			}
			else {
				
				int computerChoice = new Random().nextInt(3) + 1;
				if(playerChoice == computerChoice) {
					switch(playerChoice) {
						case 1:
							System.out.println("Your choice: Rock");
							System.out.println("PC choice: Rock");
							break;
						case 2:
							System.out.println("Your choice: Paper");
							System.out.println("PC choice: Paper");
							break;
						case 3:
							System.out.println("Your choice: Scissors");
							System.out.println("PC choice: Scissors");
							break;
					}
					++rps.drawCount;
					System.out.println("It is a draw.");
				}
				// Player picked either rock or paper.
				else if(playerChoice < computerChoice) {
					switch(playerChoice) {
						case 1:
							System.out.println("Your choice: Rock");
							
							if(computerChoice == 2) {
								System.out.println("PC choice: Paper");
								System.out.println("You lose.");
								++rps.loseCount;
							}
							else if(computerChoice == 3) {
								System.out.println("PC choice: Scissors");
								System.out.println("You win.");
								++rps.winCount;
							}
							break;
						case 2:
							System.out.println("Your choice: Paper");
							System.out.println("PC choice: Scissors");
							System.out.println("You lose.");
							++rps.loseCount;
							break;
					}
				}
				else {
					// player picked either paper or scissors.
					switch(playerChoice) {
						case 2:
							System.out.println("Your choice: Paper");
							System.out.println("PC choice: Rock");
							System.out.println("You win.");
							++rps.winCount;
							break;
						case 3:
							System.out.println("Your choice: Scissors");
							if(computerChoice == 1) {
								System.out.println("PC choice: Rock");
								System.out.println("You lose.");
								++rps.loseCount;
							}
							else if(computerChoice == 2) {
								System.out.println("PC choice: Paper");
								System.out.println("You Win.");
								++rps.winCount;
							}
							break;
					}
				}
				
				System.out.println("PC choice: " + computerChoice);
				
				++roundCount;
				--rounds;
				
				if(rounds == 0) {
					System.out.println("The game has ended.");
					System.out.println("Do you want to play again?");
					String input = sc.nextLine();
					
					if(input.equals("Yes") ) {
						System.out.println("Please enter between 1 - 10 rounds.");
						rounds = sc.nextInt();
						roundCount = 1;
					}
					else if(input.equals("No")) {
						System.out.println("Thanks for playing! Goodbye");
					}
					else {
						System.out.println("Invalid Input!");
						System.out.println("Thanks for playing! Goodbye");
					}
				}
			}
		}
		
		sc.close();
	}

}
