import java.util.Arrays;
 /**
 * CLASS DESCRIPTION
 * @author AUTHOR NAMES
 */
public class Week10Lab 
{
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
