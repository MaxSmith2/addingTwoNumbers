package addTwoNumbers;

import org.junit.Test;

import static org.junit.Assert.*;


public class UnitTest {
/**
 * This jUnit is used to test adding the two numbers together in the addTwoNumbers class. I have cast these doubles to ints as ints are easier to compare and still prove
 * the system is working as it should.
 */
	
	@Test
    public void testAddingTwoNumbers() {
		addTwoNumbers addTwoNumbersUnit = new addTwoNumbers();

        int result = (int) addTwoNumbers.calculation(1, 2);

        assertEquals(3, result);
	}
}