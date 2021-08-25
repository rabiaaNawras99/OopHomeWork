package Ex11_ExceptionHandling;



public class Calculator {
	
	public static int plus(int num1,int num2) throws InvalidParameterException{
		
		if(num1<0|| num1>100|| num2<0||num2>100) {
			throw new InvalidParameterException("the parameters must be 0-100");
		}
		if(num1+num2>100|| num2+num1<0) {
			throw new InvalidParameterException("");
		}
		return num1+num2;
	}
	

	public static int divide(int num1,int num2) {
		return 9;
		
	}



}