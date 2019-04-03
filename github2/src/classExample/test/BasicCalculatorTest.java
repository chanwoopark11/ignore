package classExample.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classExample.calculator;

class BasicCalculatorTest {

	@Test
	void testMain() {
		calculator cal = new calculator();
		assertEquals(33,cal.sum(13, 20));
	}

}
