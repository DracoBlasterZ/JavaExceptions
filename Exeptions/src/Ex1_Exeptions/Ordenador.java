package Ex1_Exeptions;

import javax.swing.JOptionPane;

public class Ordenador {
	
	public static int randomNumGen() 
	{
		return (int)(Math.random()*500+1);
	}
	public boolean adivinadoTrue(int adNum,int askNum)
	{
		if(adNum==askNum)
		{
			return true;
		}
		else if(adNum>askNum)
		{
			JOptionPane.showMessageDialog(null,"El numero a adivinar es mas grande");
			return false;
		}	
		else if(adNum<askNum)
		{
			JOptionPane.showMessageDialog(null,"El numero a adivinar es mas pequeño");
			return false;
		}
		else
			return false;
			
	}


}
