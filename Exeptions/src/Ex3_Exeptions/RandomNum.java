package Ex3_Exeptions;


public class RandomNum extends Exception{
	private int codeException;
	public RandomNum(int errorCode)
	{
		super();
		this.codeException= errorCode;
	}
	public RandomNum()
	{
		super();
	}
	
	@Override
	public String getMessage()
	{
		String menssage="";
		
		switch(codeException)
		{
		case 123:
			menssage=" El numero generado es par";
			break;
		case 127:
			menssage=" El numero que has pasado es inpar";
			break;
		}
		return menssage;
	}
	//random number generator
	public int generateRanNum()
	{
		int numGen=(int) (Math.random()*999);
		System.out.println("El numero generado es "+numGen);
		return numGen;
	}
	
}
