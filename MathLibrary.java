public class MathLibrary
{
	public static double absoluteValue(double x)
	{
		double abs = 0.0;
		if(x >= 0)
		{
			return x;
		}
		else if(x < 0)
		{
			for(double i = x; i == 0.0; i++)
			{
				abs++;
			}
			
			return abs;
		}
	}
}
public static double roundtoNearestInteger (double x) {
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
