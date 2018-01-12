
import java.util.Random;

/**
 * Player have to guessing the number.
 * If guess number is too small, the message will set "too small".
 * If guess number is too large, the message will set "too large".
 * When player guess the correct number, it'll tell you count of player's guesses.
 * 
 * @author Gunthee
 */
public class GuntheeGame extends NumberGame {
	private int secret;
	private int upperBound;
	private int counter;
	
	/**
	 * Set a new game.
	 * @param upperBound The biggest number that player can guess
	 */
	public GuntheeGame(int upperBound) {
		long seed = System.nanoTime();
		Random rand = new Random(seed);
		this.upperBound = upperBound;
		this.secret = rand.nextInt(this.upperBound)+1;
		this.counter = 0;
		System.out.println("I'm thinking of a number between 1 and "+ this.upperBound);
	}
	
	 /**
     * Evaluate a user's answer to the game.
     * @param answer is the user's answer, as an integer.
     * @return true if correct, false otherwise
     */
	public boolean guess(int number) {
		this.counter += 1;
		if (number == this.secret) {
			this.setMessage("The secret number is "+ this.secret);
			return true;
		}
		else if (number < this.secret) this.setMessage("too small");
		else if (number > this.secret) this.setMessage("too large");
		return false;
	}
	
	public int getCount() {
		return counter;
	}
	
	public int getUpperBound() {
		return this.upperBound;
	}
	
	public String toString() {
		return String.format("Guess a secret number between 1 and %d", this.upperBound);
	}
}
