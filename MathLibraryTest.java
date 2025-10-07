import org.junit.Test;
import static org.junit.Assert*;
public class MathLibraryTest {

    @Test
    public void roundToNearestInteger_PosDecimal() {
        assertEquals(7, MathLibrary.roundToNearestInteger(6.9));
    }

    @Test
    public void roundToNearestInteger_NegDecimal() {
        assertEquals(-7, MathLibrary.roundToNearestInteger(-6.9));
    }

    @Test
    public void roundToNearestInteger_Halves() {
        assertEquals(7, MathLibrary.roundToNearestInteger(7.5));
        assertEquals(-7, MathLibrary.roundToNearestInteger(-7.5));
    }

    @Test
    public void roundToNearestInteger_Wholes() {
        assertEquals(7, MathLibrary.roundToNearestInteger(7.0));
        assertEquals(-7, MathLibrary.roundToNearestInteger(-7.0));
    }
}
