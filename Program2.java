/**
 * Program Name: Program 2
 * Program Description: Classify Tobacco Ash
 * Course: CS 1131
 * Lab Section 2
 * Lab Team Name: Troll Coders
 * @author William Rauch, Jack Lilywhite, Scarlett Winter, Thomas Andersen
 */

public class Program2{
	public String classifyTobaccoAsh( String texture, String color, boolean has_particles, int nicotineCount ) {
		if (texture == "caked" && color == "dark" && has_particles == false && nicotineCount == 3){
			return "Espanada";
		}
		
		if (texture == "flaky" && color == "pale" && has_particles == false && nicotineCount == 2){
			return "Heritage";
		}

		if ((texture == "caked" || texture == "flaky" || texture == "granular" || texture == "fluffly") && color == "dark" && has_particles == true && nicotineCount == 1){
                        return "Roman";
                }

		if (texture == "caked" && color == "brown" && has_particles == false && nicotineCount == 2){
                        return "UNKNOWN";
                }

	return "INVALID_DATA";
	}
}
