??? from here until ???END lines may have been inserted/deleted
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
// This test case specifies the behavior for a negative
input
// It should fail with the current implementation.
assertEquals(10.0, MathLibrary.absoluteValue(-10.0), DELTA);
}
// Add a test case for zero (0.0) here.
}
@Test
public void roundToNearestInteger_PosDecimal (double x) {
assertEquals(7,MathLibrary.roundtoNearestIntger(6.9));
}
@Test
public void roundtoNearestInteger_NegDecimal(double x) {
	assertEquals(7, MathLibrary.roundtoNearestIntger(-6.9));
}
public void roundtoNearestInteger_Halves(double x) {
	assertEquals(7, MathLibrary.roundtoNearestInteger(7.5));
	assertEquals(-7,MathLibrary.roundtoNearestInteger(-7.5));
}
public void roundtoNearestInteger_WholeNumbers(double x) {
	assertEquals(7,MathLibrary.roundtoNearestInteger(7.0));
	assertEquals(-7,MathLibrary.roundtoNearestInteger(-7.0));
}
