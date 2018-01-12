
import java.util.Random;

/**
 * 
 * @author Gunthee
 */
public class GuntheeGame extends NumberGame {
	private int secretNumber;
	private int upperBound;
	private int counter;
	
	public GuntheeGame(int upperBound) {
		long seed = System.nanoTime();
		Random rand = new Random(seed);
		this.upperBound = upperBound;
		this.secretNumber = rand.nextInt(this.upperBound)+1;
		this.counter = 0;
		System.out.println("I'm thinking of a number between 1 and "+ this.upperBound);
	}
	
	public boolean guess(int number) {
		this.counter += 1;
		if (number == this.secretNumber) {
			System.out.println("The secret number is "+ this.secretNumber);
			return true;
		}
		else if (number < this.secretNumber) System.out.println("too small");
		else if (number > this.secretNumber) System.out.println("too large");
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
