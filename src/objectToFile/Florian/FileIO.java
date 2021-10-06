package objectToFile.Florian;

import java.io.File;
import java.util.Scanner;

/*
 * File Input and Output
 * 
 * Date 061021
 * Author Florian
 */

public class FileIO {
	
	public static String read(String fileName) {
		String output = null;
		Scanner s;
		File file;
		
		try {
			file = new File(fileName + ".txt");
			s = new Scanner(file);
			output = s.nextLine();
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return output;
		
	}

	public static void write(String string, String string2) {
		
		
	}
	
}
