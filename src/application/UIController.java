package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class UIController {
	
	
	private String operator;
	private Double number;
	@FXML
	private Text textSection;

	@FXML
	public void getDigits(ActionEvent event) {
		String value = ((Button) (event.getSource())).getText();
		if (!value.isEmpty()) {
			textSection.setText(textSection.getText() + "" + value);
		}
	}

	@FXML
	public void getOperator(ActionEvent event) {

		String value = ((Button) (event.getSource())).getText();
		if ((textSection.getText()).isEmpty()) {
			return;
		} else if (!value.isEmpty() && !value.equals("=")) {
			number = Double.parseDouble(textSection.getText());
			textSection.setText(null);
			operator = value;
		} else {
			textSection.setText(
					String.valueOf(new Model(number, Double.parseDouble(textSection.getText()), operator).calculate()));
		}
	}

	@FXML
	public void clearOperator(ActionEvent event) {
		textSection.setText("");
	}
	
}
