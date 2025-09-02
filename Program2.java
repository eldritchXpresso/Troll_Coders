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
                if (texture == "granular" && color == "gray" && has_particles == false && nicotineCount == 2){
                        return "Lunkah";
                }
                if (texture == "flaky" && color == "gray" && has_particles == false && nicotineCount == 2){
                        return "MecDuffy";
                }
                if ((texture == "caked" || texture == "flaky" || texture == "granular" || texture == "fluffy") && color == "brown" && nicotineCount == 2){
                        return "Old Wood";
                }
                if (texture == "caked" && color == "gray" && has_particles == false && nicotineCount == 2){
                        return "Top Hat";
                }
                if (texture == "flaky" && color == "dark" && has_particles == false && nicotineCount == 2){
                        return "Trichinopoloy";
                }
                if (texture == "fluffy" && color == "pale" && has_particles == true && nicotineCount == 2){
                        return "West Country";
                }
	return "INVALID_DATA";
	}
}
