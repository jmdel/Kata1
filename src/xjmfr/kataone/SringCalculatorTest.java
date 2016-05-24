package xjmfr.kataone;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SringCalculatorTest {
	private StringCalculator stringCalculator;
	private final String TWO_NUMBERS_TO_ADD = "2,1";
	private final String FIVE_NUMBERS_TO_ADD = "1,2,3,4,5";
	private final String MANY_NUMBERS_AND_SEPARATOR_TO_ADD="1\n2,3";
	private final String CHANGE_SEPARATOR_AND_ADD="//;\n1;2";
	private final String CHANGE_SEPARATOR_AND_ADD_ERROR="//;\n1,2";
	private final String NEGATIVE_NUMBER="-10";

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
	@Test
	public void addChangeSeparator() {
		// Given

		// When
		int res = stringCalculator.add(CHANGE_SEPARATOR_AND_ADD);
		// Then
		assertEquals(3, res);
	}

	@Test(expected=NumberFormatException.class)
	public void addChangeSeparatorError() {
		// Given

		// When
		int res = stringCalculator.add(CHANGE_SEPARATOR_AND_ADD_ERROR);
		// Then
		assertEquals(3, res);
	}

	@Test(expected=RuntimeException.class)
	public void negativeNumber() {
		// Given

		// When
		int res = stringCalculator.add(NEGATIVE_NUMBER);
		// Then
		assertEquals(3, res);
	}

}
