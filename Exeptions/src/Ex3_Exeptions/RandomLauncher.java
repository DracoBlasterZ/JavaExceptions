package Ex3_Exeptions;


public class RandomLauncher {

	public static void main(String[] args) {
		System.out.println("El numero se esta generando...");
		RandomNum numGen= new RandomNum();
		int numGenera=numGen.generateRanNum();
		checkIfInpar(numGenera);
		
	}
	public static void checkIfInpar(int number)
	{
		try
		{
			if(number%2==0)
			{
				throw new RandomNum(123);
			}
			else
			{
				throw new RandomNum(127);
			}
			
		}
		catch(RandomNum err)
		{
			System.out.println(err.getMessage());
		}
		
			
	}

}
