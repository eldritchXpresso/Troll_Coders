import org.junit.Test; 
import static org.junit.Assert.*;

public class MathLibraryTest {

	private static final double DELTA = 0.0001;

	@Test
	public void testPositiveValue( ) {
		assertEquals( 5.0, MathLibrary.absoluteValue( 5.0 ), DELTA );
	}

	@Test
	public void testNegativeValue( ) {
		// this test case specifies the behavior for a negative
		// input. it should fail with the current implementation.
		assertEquals( 10.0, MathLibrary.absoluteValue( -10.0 ),
				DELTA );
	}

	// add a test case for zero ( 0.0 ) here.
	
	// tests for MathLibrary.truncate( double x )
	@Test
	public void testTruncatePositiveValue( ) {
		assertEquals( 4.0, MathLibrary.truncate( 4.99 ), DELTA );
	}

	@Test
	public void testTruncateInvalidInput( ) {
		assertThrows( IllegalArgumentException.class, 
				MathLibrary.truncate( Double.NaN ), DELTA );
	}
}
