package objectToFile.Florian;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	
	public static Object readObject(String filepath) {

		try {

			FileInputStream fileIn = new FileInputStream(filepath);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);

			Object obj = objectIn.readObject();

			objectIn.close();
			return obj;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public static void writeObject(String fileName, Object fileOutput) {
		
		FileOutputStream file;
		ObjectOutputStream obj;
		
		try {
			
			file = new FileOutputStream(fileName);
			obj = new ObjectOutputStream(file);
			obj.writeObject(fileOutput);
			obj.close();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
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
