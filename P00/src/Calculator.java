
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
		  if (b == 0) {
		    throw new ArithmeticException("Cannot divide by zero");
		  }
		  return a / b;
		}
	
	
	  public double exponential(double base, double exponent) {
	    
	    return Math.pow(base, exponent);
	    
	  }
	
	

}
