package Ex1_Exeptions;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Ex1_Exeptions {

	public static void main(String[] args) {
		
		Ordenador ord=new Ordenador();
		int numAd = Ordenador.randomNumGen();	
		boolean adivinado=false;
		int numAsk=0;
		int intentNum=0;
		
		while(!adivinado)
		{
			try{
				
				
					intentNum++;
	
					String numOf=JOptionPane.showInputDialog("Intento numero "+ intentNum+" para intentar adivinar un numero entre el 1 - 500");
					numAsk= Integer.parseInt(numOf);
					adivinado=ord.adivinadoTrue(numAd,numAsk);
				}	
			
			catch(InputMismatchException e)
			{
				System.out.println("Se introducido un caracter no valido");
			}
			catch(NumberFormatException a)
			{
				System.out.println("El formato introducido no es correcto");
			}
		

	}
		JOptionPane.showMessageDialog(null,"Se han realizado "+intentNum+" intentos y el numero a adivinar era "+ numAd);
	}

}
	
