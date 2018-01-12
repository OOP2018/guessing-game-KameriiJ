/**
 * Automatically find the secret to any NumberGame.
 * @author tawewatmongkol
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
		int x = 1;
		for(x = 1;; x++) {
			if(game.guess(x)) return x;
		}
	}
}
