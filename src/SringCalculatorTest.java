import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SringCalculatorTest {
	private StringCalculator stringCalculator;
	private final String TWO_NUMBERS_TO_ADD="2,1";
@Before
public void setup(){
		stringCalculator = new StringCalculator();
}
@Test
public void addEmpty(){
	// Given
	
	// When
	int res = stringCalculator.add("");
	// Then
	assertEquals(0,res);
}

@Test
public void addTwoNumbers(){
	// Given
	
	// When
	int res = stringCalculator.add(TWO_NUMBERS_TO_ADD);
	// Then
	assertEquals(3,res);
}
	

}
