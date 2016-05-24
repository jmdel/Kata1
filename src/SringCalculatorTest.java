import static org.junit.Assert.*;
import org.junit.Test;

public class SringCalculatorTest {

@Test
public void AddEmpty(){
	// Given
	StringCalculator sc = new StringCalculator();
	// When
	int res = sc.add("");
	// Then
	assertEquals(0,res);
}

	
	

}
