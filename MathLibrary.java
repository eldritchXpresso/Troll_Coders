public class MathLibrary {
	public static double absoluteValue(double x) {
		double abs = 0.0;
		if( x >= 0 ) {
			return x;
		}
		else if( x < 0 ) {
			x *= -1;
		}
		return x;
	}
	public static double roundToNearestInteger( double x ) {
		// not my job
		return 0.0;
	}
	public static double powerOfTwo( int n ) {
		// Computes 2^n for n >= 0
		// not mine
		return 0.0;
	}
	public static double truncate( double x ) {
		int myX = (int)x; // convert double to int, removing any
				  // values after the decimal
		x = (double)myX;
		
		return x;
	}
}
