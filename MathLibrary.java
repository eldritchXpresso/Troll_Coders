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
