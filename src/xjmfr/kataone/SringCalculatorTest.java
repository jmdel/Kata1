package xjmfr.kataone;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SringCalculatorTest {
	private StringCalculator stringCalculator;
	private final String TWO_NUMBERS_TO_ADD = "2,1";
	private final String FIVE_NUMBERS_TO_ADD = "1,2,3,4,5";
	private final String MANY_NUMBERS_AND_SEPARATOR_TO_ADD="1\n2,3";
	@Before
	public void setup() {
		stringCalculator = new StringCalculator();
	}

	@Test
	public void addEmpty() {
		// Given

		// When
		int res = stringCalculator.add("");
		// Then
		assertEquals(0, res);
	}

	@Test
	public void addTwoNumbers() {
		// Given

		// When
		int res = stringCalculator.add(TWO_NUMBERS_TO_ADD);
		// Then
		assertEquals(3, res);
	}
	@Test
	public void add1_2_3_4_5() {
		// Given

		// When
		int res = stringCalculator.add(FIVE_NUMBERS_TO_ADD);
		// Then
		assertEquals(15, res);
	}
	@Test
	public void addMany() {
		// Given

		// When
		int res = stringCalculator.add(MANY_NUMBERS_AND_SEPARATOR_TO_ADD);
		// Then
		assertEquals(6, res);
	}

}
