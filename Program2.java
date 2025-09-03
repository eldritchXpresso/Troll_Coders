/**
* Program Description: Classify Tobacco Ash
 *  * Course: CS 1131
 *   * Lab Section 2
 *    * Lab Team Name: Troll Coders
 *     * @author William Rauch, Jack Lilywhite, Scarlett Winter, Thomas Andersen
 *      */

 public class Program2
{
	public String classifyTobaccoAsh( String texture, String color, boolean has_particles, int nicotineCount ) 
	{
		if (texture == "caked" && color == "dark" && has_particles == false && nicotineCount == 3)
		{
			System.out.println("The tobacco brand is: Espanda");
			return "Espanada";
		}
		if (texture == "flaky" && color == "pale" && has_particles == false && nicotineCount == 2)
		{
			System.out.println("The tobacco brand is: Heritage");
			return "Heritage";
		}
		if ((texture == "caked" || texture == "flaky" || texture == "granular" || texture == "fluffly") && color == "dark" && has_particles == true && nicotineCount == 1)
		{
			System.out.println("The tobacco brand is: Roman");
			return "Roman";
		}
		if (texture == "caked" && color == "brown" && has_particles == false && nicotineCount == 2)
		{										                        			System.out.println("The tobacco brand cannot be determined from the data");
			return "UNKNOWN";												}
		if (texture == "granular" && color == "gray" && has_particles == false && nicotineCount == 2)
		{
			System.out.println("The tobacco brand is: Lunkah");
			return "Lunkah";
		}
													                		if (texture == "flaky" && color == "gray" && has_particles == false && nicotineCount == 2)				{
			System.out.println("The tobacco brand is: MacDuffy");									return "MacDuffy";
		}
															                if ((texture == "caked" || texture == "flaky" || texture == "granular" || texture == "fluffy") && color == "brown" && nicotineCount == 2)
																	{
			System.out.println("The tobacco brand is: Old Wood");									return "Old Wood";
		}
		if (texture == "caked" && color == "gray" && has_particles == false && nicotineCount == 2)
		{
			System.out.println("The tobacco brand is: Top Hat");
			return "Top Hat";
		}
		if (texture == "flaky" && color == "dark" && has_particles == false && nicotineCount == 2)
		{
			System.out.println("The tobacco brand is: Trichinopoloy");	
			return "Trichinopoloy";
		}
		if (texture == "fluffy" && color == "pale" && has_particles == true && nicotineCount == 2)
		{
			System.out.println("The tobacco brand is: Trichinopoloy");
			return "Trichinopoloy";
		}
		if (texture == "fluffy" && color == "pale" && has_particles == true && nicotineCount == 2)
		{
			System.out.println("The tobacco brand is: West Country");
			return "West Country";
		}
																	return "INVALID_DATA";
																}
 }
