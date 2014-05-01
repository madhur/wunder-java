package in.co.madhur.wunderjava.api;


public class AuthException extends Exception
{
	String errorMessage;
	private AuthError errorCode;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AuthException(String message)
	{
		this.errorMessage=message;
		
	}
	
	public AuthException(AuthError errorCode)
	{
		this.errorCode=errorCode;
		
	}
	
	public AuthException(String message, AuthError errorCode)
	{
		this.errorMessage=message;
		this.errorCode=errorCode;
		
	}

	
	
	@Override
	public String getMessage()
	{
		super.getMessage();
		return errorMessage;
	}


	public AuthError getErrorCode()
	{
		return errorCode;
	}


	public void setErrorCode(AuthError errorCode)
	{
		this.errorCode = errorCode;
	}

}
