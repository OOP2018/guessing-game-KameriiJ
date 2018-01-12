/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 100;
		GuntheeGame game = new GuntheeGame(upperBound);
		GameConsole ui = new GameConsole( );
		int solution = ui.play( game );
		
		System.out.println("\nplay() returned "+solution);
		
	}
}
