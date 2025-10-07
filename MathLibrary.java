public class MathLibrary {
	public static double absoluteValue(double x) {

		if(x < 0){
			x = x * -1;
		}
		return x;
	}
	public static double powerOfTwo(int n) {
		int ans = -1;
		if (n>=0) {
			ans = n * n;
		}
		else {
			throw new IllegalArgumentException();
		}
		return ans;
	}
	public static double roundToNearestInteger (double x) {
		int whole = (int) x;
		double fraction = x - whole;

		if (x >= 0) {
			if (fraction >= .5) {
				return whole + 1;
			} else {
				return whole;
			}
		} else {
		if( fraction <= -.5) {
			return whole;
			} else {
				return whole -1;
			}
		}
	}
}
