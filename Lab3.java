/**
 * Program Name: Week 3 Lab
 * Program Description: 
 * Course: CS1131
 * Lab Section: L03
 * Lab Team Name: Troll Coders
 * @author: Thomas Andersen, Jack Lillywhite, William Rauch, Scarlett Winter
 */

class Lab3{
	public static long multiply( long multiplicand, long multiplier ){
		
		long product = 0;

		for ( int i = 1; i <= multiplier; i++ ) {
			product  += multiplicand;
		}

		return product;
	}
	public static long power( int base, int exponent ){
		
		long power = 1;
		
		for ( int i = 1; i <= exponent; i++){
			power = multiply( power, base );
		}

		return power;
	}
	public static long log( int base, int argument){
		
		long exponent = 0;

		while ( power( base, (int)exponent ) != (long)argument ){
			exponent++;
		}

		return exponent;
	}
	public static void printPowers( int base, int maxExponent ){
		//todo
	}
	public static void printLogs( int base, int maxArgument ){
		//todo
	}
	public static void main(String[] args){
		System.out.println( "multiply( 4, 5 ) is " + multiply( 4, 5 ) );
		System.out.println( "power( 4, 3 ) is " + power( 4, 3 ) );
		System.out.println( "log( 2, 8 ) is " + log( 2, 8 ) );
	}
}
