package objectToFile.Florian;

import java.io.File;
import java.io.FileWriter;
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

	public static void write(String fileName, String fileOutput) {
		FileWriter out;
		File fileOut;
		try {
			fileOut = new File(fileName + ".txt");
			fileOut.createNewFile();
			
			out = new FileWriter(fileOut);
			out.write(fileOutput);
			out.close();
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
}
