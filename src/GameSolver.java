/**
 * Automatically find the secret to any NumberGame.
 * @author Gunthee Tawewatmomgkol
 */
public class GameSolver {
	
	/**
	 * Play a Number Game and return the solution.
	 * The NumberGame object must provide messages (getMessage)
	 * containing the phrase "too small" if guess is too small
	 * add "too large" if a guess is too large, for efficient
	 * solution.
	 * 
	 * @param game is the NumberGame to solve
	 * @return the solution of NumberGame
	 */
	public int play(NumberGame game) {
		int upperBound = game.getUpperBound();
		int num = upperBound;
		int pow = 1;
		while(true) {
			int divisor = (int)Math.pow(2, pow);
			if(divisor > upperBound) divisor = upperBound;
			if (game.guess(num)) {
				if(num > upperBound) System.out.println("The secret number is bigger than upperbound.");
				return num;
			}
			if (game.getMessage().equals("too small")) {
				num += upperBound/divisor;
			}
			if(game.getMessage().equals("too large")) {
				num -= upperBound/divisor;
			}
			pow++;
		}
	}
}
