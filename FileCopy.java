import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.FileWriter;

public class FileCopy
{
	public static void main(String[] args) 
	{
		PrintWriter writer = null;
		Scanner scanner = null;
		try
		{
			scanner = new Scanner(new File("source.txt"));
			FileWriter fw = new FileWriter("destination.txt");
			writer = new PrintWriter(fw);

 			while(scanner.hasNextLine()) 
			{
 				String line = scanner.nextLine();
 				writer.print(line);
 			}
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		finally
		{
			if(scanner != null)
			{
				scanner.close();
			}
		}
		if(writer != null)
		{
			writer.flush();
			writer.close();
		}


 		
 	}
 }
