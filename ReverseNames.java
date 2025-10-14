import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class ReverseNames {
	public static void main(String [] args) {
		File file = new File("names.txt");
		ArrayList<String> name = new ArrayList<>();  
	       try {
		   Scanner scanner = new Scanner(file);    
		   while (scanner.hasNext()) {
			 name.add(scanner.next());
		    }
		    scanner.close();
	       }
		catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		    for(int i = name.size() - 1; i>= 0; i--) {
			    System.out.println(name.get(i));
		    }
	
	}
}

