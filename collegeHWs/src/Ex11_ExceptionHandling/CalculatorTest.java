package Ex11_ExceptionHandling;



public class CalculatorTest {

	public static void main(String[] args) {
		//1.
		try {
			int res=Calculator.plus(100, 23);
			System.out.println(res);
		}
		catch (InvalidParameterException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//2.
		try {
			int res2=Calculator.subtract(100, 23);
			System.out.println(res2);
		}
		catch (InvalidParameterException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//3.
		try {
			int res3=Calculator.multiplication(100, 23);
			System.out.println(res3);
		}
		catch(InvalidParameterException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//4.
		try {
			int res4=Calculator.subtract(100, 23);
			System.out.println(res4);
		}
		catch (InvalidParameterException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}
}