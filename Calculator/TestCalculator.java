import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * A class for testing the methods of the Calculator class behave as expected.
 * See: http://junit.sourceforge.net/javadoc/org/junit/Assert.html For more
 * JUnit Assertion Statements
 * 
 * @author Chris Schmidt
 * 
 */
class TestCalculator {

	// this test class return the remainder of two numbers
	@Test
	void testRemainder() {
		try {
			Calculator.remainder(12, 0);
		} catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}
		assertEquals(2, Calculator.remainder(7, 5));
		assertEquals(0, Calculator.remainder(14, 7));
	}

	// this test class return the sum of two numbers
	@Test
	void testAdd() {
		assertEquals(15, Calculator.add(10, 5));
		assertEquals(16, Calculator.add(37, -21));
	}

	// this test class return the multiplication of two numbers
	@Test
	void testMultiply() {

		assertEquals(81, Calculator.multiply(9, 9));
		assertEquals(20, Calculator.multiply(5, 4));

	}

	// this test class return the subtraction of two numbers
	@Test
	void testSubtract() {
		assertEquals(32, Calculator.subtract(34, 2));
		assertEquals(4, Calculator.subtract(6, 2));

	}

	// this test class return the division of two numbers
	@Test
	void testDivide() {
		assertEquals(2.0, Calculator.divide(6.0, 3.0));
		assertEquals(4.5, Calculator.divide(9.0, 2.0));

	}

	// this test class return the average of two numbers
	@Test
	void testAverage() {
		assertEquals(6, Calculator.average(8, 4));
		assertEquals(6, Calculator.average(6, 2));

	}

	// this test class return the median of two numbers
	@Test
	void testMedian() {
		assertEquals(5, Calculator.median(5, 2));
		assertEquals(10, Calculator.median(10, 2));

	}

	// this test class return the max of two numbers
	@Test
	void testMax() {
		assertEquals(3, Calculator.max(3, 1));
		assertEquals(9, Calculator.max(9, 6));

	}

	// this test class return the minor of two numbers
	@Test
	void testMin() {
		assertEquals(1, Calculator.min(3, 1));
		assertEquals(7, Calculator.average(9, 6));

	}
}
