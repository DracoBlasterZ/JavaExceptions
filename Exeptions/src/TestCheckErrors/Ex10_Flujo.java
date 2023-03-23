package TestCheckErrors;
import javax.swing.JOptionPane;

import Ex2_Exeptions.CheckErrors;


public class Ex10_Flujo {

	public static void main(String[] args) {
		
		String numOf=JOptionPane.showInputDialog("Introduzca un numero que desee");
		int vent= Integer.parseInt(numOf);
		try {
			if(vent>=0 &&vent<=5)
			{
				throw new CheckErrors(111);
			}
			else if(vent>=6 &&vent<=15)
			{
				throw new CheckErrors(222);
			}
			else if(vent>=16 &&vent<=35)
			{
				throw new CheckErrors(333);
			}
			
		}
		catch(CheckErrors er)
		{
			System.out.println(er.getMessage());
		}
		
		
	}

}
