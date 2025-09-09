public class Lab3 {
	public static long multiply( long multiplicand , long multiplier) {
		long number = multiplicand;
		if (multiplicand == 0 || multiplier == 0) {
			number = 0;
		}
		else {
			for(int i = 1; i < multiplier; i++) {
				number = number + multiplicand;
			}
		}

		return number;
	}
	public static long power(int base , int exponent) {
		long number = base;
		if (exponent == 0) {
			number = 1;
		}
		else {
			for (int i = 1; i < exponent; i++) {
				number = multiply( number , base );
			}
		}

		return number;
	}
	public static long log( int base , int argument) {
		int count = 0;
		while ( power(base , count) != argument) {
			count++;
		}
		return count;
	}
	public static void printPowers( int base , int maxExponent ) {
		for (int i = 0; i <= maxExponent; i++) {
			System.out.println(power(base, i));
		}
	}
	public static void printLogs( int base , int maxArgument ) {
		for (int i = 1; i <= maxArgument; i++) {
			System.out.println(log(base, i));
		}
	}
	public static void main(String[] args) {
		printPowers(2, 8);
		printLogs(2, 256);
		printPowers(3, 8);
		printLogs(3, 6561);
	}
}
