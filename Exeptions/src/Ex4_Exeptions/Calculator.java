package Ex4_Exeptions;

import javax.swing.JOptionPane;

public class Calculator extends Exception {
	private String operationOf;

	public Calculator(String errorCode) {
		super();
		this.operationOf = errorCode;
	}

	public Calculator() {
		super();
	}

	@Override
	public String getMessage() {
		String menssage = "";
		String numOf1 = JOptionPane.showInputDialog("Introduzca el primer numero");
		int num1 = Integer.parseInt(numOf1);
		String numOf2 = JOptionPane.showInputDialog("Introduzca el segundo numero");
		int num2 = Integer.parseInt(numOf2);
		double d;

		switch (operationOf) {
		case "+":
			menssage = ("La suma es " + (num1 + num2));
			break;
		case "-":
			menssage = ("La resta es " + (num1 - num2));
			break;
		case "*":
			menssage = ("La multiplicacion es " + (num1 * num2));
			break;
		case "/":
			d = num1 / num2;
			menssage = ("La division es " + d);
			break;
		case "^":
			menssage = ("La operacion con base " + num1 + " y exponente " + num2 + " es " + (Math.pow(num1, num2)));
			break;
		case "%":
			d = num1 % num2;
			menssage = ("El resto de la division es " + d);
			break;
		default:
			menssage = ("No se ha reconocido la operacion solicitada ");
			break;
		}
		return menssage;
	}

}
