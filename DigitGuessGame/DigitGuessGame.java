
/**
 @author Xieqi Zhang
 *  Description: The program generates a random number between 1 and 10. If the user input number matches the generated number, then the code prints a message to inform 
 *  users that he/she has a correct guess. If the guess is not correct, allow the user to have two more chances to guess the correct number. At any time, 
 *  if users enter 0, then the program should display the game summary and exits. The program keep track of the wins and losses and print the counts when user 
 *  chooses to exit by entering 0. The program should generate a new random number only after user enters the correct guess or after user has tried 3 times and did 
 *  not have the right guess. 
 */
import java.util.Random;
import java.util.Scanner;
public class DigitGuessGame {
	public static void main(String[] args){
		int win = 0;
		int lose = 0;
		Random random = new Random(System.currentTimeMillis());
		Scanner in = new Scanner(System.in);
		
		int result;
		do{
			int secretNum = random.nextInt(10)+1;
			result = playAGame(secretNum, in);
			win += (result == 1)?1:0;
			lose += (result == -1)?1:0;
		}while (result != 0);
		System.out.println("Here is your all-game summary:"
				+"\nTotal games:          "+(win+lose)
				+"\nTotal game wins:      "+win
				+"\nTotal game losses:    "+lose);
	}
		
	
	public static int playAGame(int secretNum, Scanner in){
		System.out.print("Welcome to guessing game.\n"
				+ "Answer with number >= 1 and <= 10. The maximum attempt is 3 per game.\n"
				+"Enter a number >= 1 and <= 10 or Enter 0 to stop the game:");
		for (int i = 0; i < 3; i++){
			int userInput = in.nextInt();
			if (userInput == secretNum){
				System.out.println("Congratulation, correct! Let’s start a new game  with a new secret number.");
				return 1;
			}
			if (userInput == 0){
				return 0;
			}
			if (userInput != secretNum&&i!=2){
				System.out.print("Not correct, try again:");
			}
		}
		System.out.println("Not correct. You have reached your third trials. The correct number is "+secretNum);
		return -1;
	}
}
