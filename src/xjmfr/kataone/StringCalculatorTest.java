package xjmfr.kataone;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	private StringCalculator stringCalculator;
	private final String TWO_NUMBERS_TO_ADD = "2,1";
	private final String FIVE_NUMBERS_TO_ADD = "1,2,3,4,5";
	private final String MANY_NUMBERS_AND_SEPARATOR_TO_ADD = "1\n2,3";
	private final String CHANGE_SEPARATOR_AND_ADD = "//;\n1;2";
	private final String CHANGE_SEPARATOR_AND_ADD_ERROR = "//;\n1,2";
	private final String NEGATIVE_NUMBER = "-10";
	private final String BIGGER1000 = "1001,2";

	@Before
	public void setup() {
		stringCalculator = new StringCalculator();
	}

	@Test
	public void addEmpty() {
		// Given

		// When
		int result = stringCalculator.add("");
		// Then
		assertEquals(0,result);
	}

	@Test
	public void addTwoNumbers() {
		// Given

		// When
		int result = stringCalculator.add(TWO_NUMBERS_TO_ADD);
		// Then
		assertEquals(3,result);
	}

	@Test
	public void add1_2_3_4_5() {
		// Given

		// When
		int result = stringCalculator.add(FIVE_NUMBERS_TO_ADD);
		// Then
		assertEquals(15,result);
	}

	@Test
	public void addMany() {
		// Given

		// When
		int result = stringCalculator.add(MANY_NUMBERS_AND_SEPARATOR_TO_ADD);
		// Then
		assertEquals(6,result);
	}

	@Test
	public void addChangeSeparator() {
		// Given

		// When
		int result = stringCalculator.add(CHANGE_SEPARATOR_AND_ADD);
		// Then
		assertEquals(3,result);
	}

	@Test(expected = NumberFormatException.class)
	public void addChangeSeparatorError() {
		// Given

		// When
		stringCalculator.add(CHANGE_SEPARATOR_AND_ADD_ERROR);
		//whith a coma (,) separator in sequence but changed before into a semicolon (;)
		
		// Then
	}

	@Test(expected = RuntimeException.class)
	public void negativeNumber() {
		// Given

		// When
		stringCalculator.add(NEGATIVE_NUMBER);
		//Negative numbers not allowed in sequence 
		// Then
	}

	@Test
	public void ignoreBiggerThan1000() {
		// Given

		// When
		int result = stringCalculator.add(BIGGER1000);
		// Then
		assertEquals(2, result);
	}

}
