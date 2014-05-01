package in.co.madhur.wunderjava.api;

public class NetworkException extends Exception
{
	
	String errorMessage;
	
	public NetworkException(String message)
	{
		this.errorMessage=message;
		
	}
	
	@Override
	public String getMessage()
	{
		super.getMessage();
		return errorMessage;
	}

}
