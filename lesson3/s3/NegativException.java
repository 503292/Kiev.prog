package lesson3.s3;

public class NegativException extends Exception{

	@Override
	public String getMessage() {
		
		return "Value must be positiv";
	}
	

}
