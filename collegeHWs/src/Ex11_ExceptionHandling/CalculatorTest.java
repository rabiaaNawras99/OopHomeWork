package Ex11_ExceptionHandling;



public class CalculatorTest {

	public static void main(String[] args) {
		try {
			int res=Calculator.plus(100, 23);
			System.out.println(res);
		}
		catch (InvalidParameterException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
	}
}