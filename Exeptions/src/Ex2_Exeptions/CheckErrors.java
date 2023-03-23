package Ex2_Exeptions;

public class CheckErrors extends Exception{
	private int codeException;
	
	public CheckErrors(int errorCode)
	{
		super();
		this.codeException= errorCode;
	}
	public CheckErrors()
	{
		super();
	}
	
	@Override
	public String getMessage()
	{
		String menssage="";
		
		switch(codeException)
		{
		case 111:
			menssage=" error 111: El numero indicado esta entre 0 y 5";
			break;
		case 222:
			menssage=" error 222: El numero indicado esta entre 6 y 15";
			break;
		case 333:
			menssage=" error 333: El numero indicado esta entre 16 y 35";
			break;
		}
		return menssage;
	}
	
}
