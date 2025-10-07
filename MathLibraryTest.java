import org.junit.Test;
import static org.junit.Assert.*;
public class MathLibraryTest {
	private static final double DELTA = 0.0001;
	@Test
	public void testPositiveValue() {
		assertEquals(5.0, MathLibrary.absoluteValue(5.0), DELTA);
	}
	@Test
	public void testNegativeValue() {
		assertEquals(10.0, MathLibrary.absoluteValue(-10.0), DELTA);
	}
	@Test
	public void testPowerOfTwo() {
		assertEquals(0, MathLibrary.powerOfTwo(0), DELTA);
	}
	@Test
	(expected = IllegalArgumentException.class)public void testNegativePowerOfTwo() {
		MathLibrary.powerOfTwo(-3);
	}
	@Test
	public void roundToNearestInteger_PosDecimal() {
        	assertEquals(7, MathLibrary.roundToNearestInteger(6.9), DELTA);
    	}

    	@Test
    	public void roundToNearestInteger_NegDecimal() {
        	assertEquals(-7, MathLibrary.roundToNearestInteger(-6.9), DELTA);
    	}

    	@Test
    	public void roundToNearestInteger_Halves() {
        	assertEquals(8, MathLibrary.roundToNearestInteger(7.5), DELTA);
        	assertEquals(-7, MathLibrary.roundToNearestInteger(-7.5), DELTA);
    	}

    	@Test
    	public void roundToNearestInteger_Wholes() {
        	assertEquals(7, MathLibrary.roundToNearestInteger(7.0), DELTA);
        	assertEquals(-7, MathLibrary.roundToNearestInteger(-7.0), DELTA);
    	}
	
}
