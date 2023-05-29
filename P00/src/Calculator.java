
public class Calculator {
	
	public int add(int a, int b)
	{
		return a + b;
	}
	public int subtract(int a, int b)
	{
		return a - b;
	}
	
	public int divide(int a, int b)
	{
		return a / b;
	}
	
	public int multiply(int a, int b)
	{
		return a * b;
	}
	
	
	
	public int testdivide(int a, int b) {
		  // Check if the denominator is 0
		  if (b == 0) {
		    // Throw an ArithmeticException with a message
		    throw new ArithmeticException("Cannot divide by zero");
		  }
		  // Otherwise, perform the division as usual
		  return a / b;
		}
	
	

}
