package practice22;


public class Calculator {
	public static int divide(int x,int y) throws IllegalInputException{
		 try {
	            return x / y;
	        } catch (java.lang.ArithmeticException e) {
	            throw new IllegalInputException(e);
	        }
	}
}
