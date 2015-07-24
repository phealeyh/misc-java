
import java.util.*;
/*
 *		Chapter 6 Sample development: Hi-Lo Game (Step 1)
 *	The instantiable main class of the program
 */

public class Ch6HiLo {

	private static enum Response {YES, NO}
	private static enum Response1 {YES, NO}
	private Scanner scanner;
	private static final int MAX_ALLOWED_GUESS = 6;
	private static int LOWER_BOUND = 0;
	private static int UPPER_BOUND = 0;

	private int secretNumber;
	
	public static void main(String [] args){ //1st level method
	
		Ch6HiLo hiLo = new Ch6HiLo(); //push to 2nd level method
		hiLo.start(); //push to 2nd level method

	} //end of main method
	
	public Ch6HiLo(){ //2nd level method
		scanner = new Scanner(System.in); //create the scanner object for user input
	}
	
	public void start(){ //2nd level method
		Response answer; //declare an enumerator called answer(yes/no)
		Response1 describeRules; //declare an enumerator called describeRules
		
		describeRules = describeRules(); //push to 3rd level method
		
		answer = prompt("Do you want to player another Hi-Lo Game?"); //push to 3rd level method
		while(answer == Response.YES){  //keep looping until response is no
			generateSecretNumber(); //push to 3rd level method
			playGame(); //push to 3rd level method
			answer = prompt("Do you want to play another Hi-Lo game?"); //push to 3rd level method
		}
	System.out.println("Thank you for playing Hi-Lo."); //this is the last output.
	} //end method -- pop up back to the 1st level method
	
	
	private Response prompt(String question){ //3rd level method -- return a response enumerator
		String input; //declare string
		Response response = Response.NO; //set response enumerator to no
		System.out.print(question + " (Yes - y; No - n):"); ///'question' is a string carried over from the start method
		input = scanner.next();
		if (input.equals("Y") || input.equals("y") || input.equals("YES") || input.equals("Yes") || input.equals("yes")) {
			response = Response.YES;
			setBounds(); //push to 4th level method
		}
		return response; //returns the set state
	} //end method

	
	private Response1 describeRules(){ //3rd level method
		String input;
		Response1 describeRules = Response1.NO;
		System.out.println("Inside describeRules"); //
		System.out.println("Do you want to see the rules? (Yes - y; No - n): ");
		input = scanner.next();
		if (input.equals("Y") || input.equals("y") || input.equals("YES") || input.equals("Yes") || input.equals("yes")) {
			describeRules = Response1.YES;
			System.out.println("The rules are simple. You have 6 tries to guess the correct answer. If your guess is lower than the random secret number,"
					+ " then a 'LO' output will be displayed; if it is higher than the secret number, then 'HI' output will be displayed. "
					+ "If you guess the correct number within the 6 tries, you win the game. It's that simple.	");
		}
		return describeRules; //return the result (either y or n)
	} // end method -- pop up to 2nd level method
	
	private void generateSecretNumber(){ //3rd level method
		double X = Math.random(); //declare and initiliase a random number
		secretNumber = (int) Math.floor ( X * UPPER_BOUND) + 1; //secret number is set
		System.out.println("Inside generateSecretNumber" + ".Secret number is " + secretNumber + " and random number is " + X);
	} //end method
	
	private void playGame(){ //3rd level method
		System.out.println("Inside playGame"); //TEMP
		int guessCount = 0;
		int guess;
		
		do{
			guess = getNextGuess(); //push to 4th level method
			guessCount++; //increment
			if (guess < secretNumber){ //is the guess lower than the secretNumber
				System.out.println("Your guess is Lo");
			}
			else if(guess > secretNumber){ //is the guess higher than the secretNumber
				System.out.println("Your guess is Hi");
			}
		}while(guessCount < MAX_ALLOWED_GUESS && guess != secretNumber); //keep looping if the guesscount is less than 6 and the input is not equal to the secret number
		
		if (guess == secretNumber){
			System.out.println("Congratulations. You guessed it in " + guessCount + " tries."); //print out if user guesses random number
			}
		else {
			System.out.println("You lost. Secret No. was " + secretNumber);
			}
		} //end method -- pop back up to the 2nd level method
	
	private void setBounds(){ //4th level method
		System.out.println("Enter the lower-bound limit: ");
		LOWER_BOUND = scanner.nextInt();
		System.out.println("Now enter the upper-bound limit: ");
		UPPER_BOUND = scanner.nextInt();
	} //end method -- pop back up to 3rd level method
	
	private int getNextGuess(){ //4th level method
		int input;
		
		while (true) { 
			System.out.println("Next Guess: ");
			input = scanner.nextInt(); //accept next guess
			
			if (input >= LOWER_BOUND  && input <= UPPER_BOUND){
				return input;
			} //end if statement
			else{
				System.out.println("Your input is either too low or too high"); //print out if input is either over 100 or less than 1
			} //end else statement
		} // end while loop
		
	} //end method
		
}
