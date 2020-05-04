package application;

public class Model {
	private double number1;
	private double number2;
	private String operator;

	public Model(double number1, double number2, String operator) {

		this.number1 = number1;
		this.number2 = number2;
		this.operator = operator;
	}

	public String calculate() {
		switch (operator) {
		case "+":
			return String.valueOf(number1 + number2);
		case "–":
			return String.valueOf(number1 - number2);
		case "×":
			return String.valueOf(number1 * number2);
		case "÷":
			if (number2 == 0)
				return "Infinity";
			else
				return String.valueOf(number1 / number2);

		default:
			break;
		}
		return "error";
	}

}
