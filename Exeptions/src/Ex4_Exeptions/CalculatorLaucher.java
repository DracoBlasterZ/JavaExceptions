package Ex4_Exeptions;

import javax.swing.JOptionPane;


public class CalculatorLaucher {

	public static void main(String[] args) {
		String operation=JOptionPane.showInputDialog("Porfavor que operacion quiere realizar:  + - * / ^ %");
		try
		{
			throw new Calculator(operation);
		}
		catch(Calculator err)
		{
			System.out.println(err.getMessage());
		}
	

	}

}
