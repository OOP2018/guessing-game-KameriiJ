import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 *  @author Gunthee
 */
public class GameConsole {

	/** 
	 * The play method plays a game using intput from a user.
	 * @param 
	 * @return the correct answer when player guess the correct answer
	 */
	public int play(GuntheeGame game) {
		boolean correct;
		int guess;
		
		Scanner console = new Scanner(System.in);
		System.out.println( game.toString() );
		System.out.println( game.getMessage() );
		do {
			System.out.print("Your answer? ");
			guess = console.nextInt();
			correct = game.guess(guess);
		}while(!correct);
		System.out.println("You make " + game.getCount() + "guesses.");
		return guess;
	}
	
}
