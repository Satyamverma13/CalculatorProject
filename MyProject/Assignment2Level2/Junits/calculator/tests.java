package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calc.calculator;

public class tests {

	@Test
	public void testsadd() {
	assertEquals(92,calculator.add(23, 69));
	}
	@Test
	public void testssub() {
	assertEquals(46,calculator.sub(69, 23));
	}
	@Test
	public void testsmul() {
	assertEquals(1587,calculator.mul(23, 69));
	}
	@Test
	public void testsdiv() {
	assertEquals(3,calculator.div(69, 23));
	}
}
