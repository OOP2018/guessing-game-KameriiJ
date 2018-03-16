import javafx.fxml.FXML;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;

public class GuessingController {
	@FXML
	TextField textfield;
	@FXML
	Labeled label;
	
	private String defaultStyle = "";
	private GuntheeGame myGame = new GuntheeGame(100);
	private CounterView view2 = new CounterView(myGame);

	public void guess() {
		try {
			textfield.setStyle(defaultStyle);
			String numberSt = textfield.getText().trim();
			int number = Integer.parseInt(numberSt);
			if (number > 100) {
				label.setText("Please input a number between 1 to 100.");
			}
			else {
				myGame.guess(number);
				if (myGame.getMessage().contains("The secret number is")) {
					label.setText("You win!");
					textfield.clear();
					myGame = new GuntheeGame(100);
				} else {
					label.setText(myGame.getMessage());
				}
			}
			defaultStyle = textfield.getStyle();
			textfield.requestFocus();
			textfield.clear();
			myGame.addObserver(view2);
			view2.run();
		} catch (Exception ex) {
			textfield.setStyle("-fx-background-color: red");
			textfield.clear();
			label.setText("Please input a number between 1 to 100.");
		}
	}

	public void giveUp() {
		GameSolver solver = new GameSolver();
		int number = solver.play(myGame);
		label.setText("The secret number is " + number);
		myGame = new GuntheeGame(100);
	}
}
