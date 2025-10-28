import static org.junit.Assert.*;
import org.junit.Test;

 /**
  * Tests cases
  * @Jack Lillywhite, Thomas Andersen, William Rauch, Scarlett Winter
  * */

 public class Week10LabTest 
{
        @Test
public void isPalindrome() {
Week10Lab kevin = new Week10Lab();
assertTrue(kevin.isPalindrome(""));

assertTrue(kevin.isPalindrome("t"));

assertTrue(kevin.isPalindrome("kayak"));

assertFalse(kevin.isPalindrome("Patriots"));

}

/**
 * The tests that will run are going to be an empty string, an one charcter string, a palindrome, not a palindrome.
 */
}

	@Test
	public void sumDigits()
	{
		
		Week10Lab kevin = new Week10Lab();
 		/**
 		* Finds max value in an array
 		*/
			
		Integer[] a = { 10, 15, 30, 20};
		System.out.println(kevin.maxValue(a));
	}
 } // END OF CLASS Week10LabTest
