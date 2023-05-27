import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		// fail("Not yet implemented");
	}
	@Test
	public void testAdd() {
		// fail("Not yet implemented");

		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 9999;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 5555;
		assertEquals(actual, expected);
		
	}
	@Test
	public void testMultiply() {
	  int a = 123;
	  int b = 456;
	  Calculator cal = new Calculator();
	  int actual = cal.multiply(a, b);
	  int expected = 56088;
	  assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {
	  int a = 1000;
	  int b = 200;
	  Calculator cal = new Calculator();
	  int actual = cal.divide(a, b);
	  int expected = 5;
	  assertEquals(expected, actual);
	}
	
	public int divide(int a, int b) {
		  // Check if the denominator is 0
		  if (b == 0) {
		    // Throw an ArithmeticException with a message
		    throw new ArithmeticException("Cannot divide by zero");
		  }
		  // Otherwise, perform the division as usual
		  return a / b;
		}

		@Test
		public void testDivideByZero() {
		  int a = 1000;
		  int b = 0;
		  Calculator cal = new Calculator();
		  // Use assertThrows to check if the method throws an exception
		  assertThrows(ArithmeticException.class, () -> {
		    // Call the method with the invalid input
		    cal.divide(a, b);
		  });
		}


}
