import java.util.Arrays;
 /**
 * CLASS DESCRIPTION
 * @author Thomas Andersen, Jack Lillywhite, William Rauch, Scarlett Winter
 */
public class Week10Lab 
{
public static boolean isPalindrome( String s ) {
        if(s == null || s.length() <= 1) {
                return true;
        }


        char firstChar = s.charAt(0);

        char lastChar = s.charAt(s.length() - 1);

        if(firstChar != lastChar) {
                return false;
        }

        String midString = s.substring(1, s.length() - 1);
        return isPalindrome(midString);

/**
 * The first part of the code checks to see if the string has no charters or less than or equal to 1 because those will always be palindromes.
 * The next piece of code defines the first and last character and sees if they are different because that would not qualify the string to be a palindrome
 * The final piece of code removes the outer charcters and will go through the other two pieces to make sure the string is a palindrome.
 * @param String is the parameter that is going through isPalindrome to see if the String is a palindrome.
 * @return The return value is a boolean which means the code will output a true value or a false value.
 */
}


 	/**
 	* Returns max value in array
 	* @param takes in integer array
 	* @return max value in the array
 	*/
	public Integer maxValue( Integer[] a ) 
	{
		int maxNum = 0;
		int newNum = 0;
 		for(int i = 0; i < a.length; i++)
		{
			maxNum = a[i-1];
			newNum = a[i];
			if(newNum > maxNum)
			{
				maxNum = newNum;
			}
		}
		return maxNum;
 	}

 } // END OF CLASS Week10Lab
