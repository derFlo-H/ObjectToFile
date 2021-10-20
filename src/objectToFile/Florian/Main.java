package objectToFile.Florian;

/*
 * A simple program that converts an Object to a file and back
 * 
 * Date 061021
 * Author Florian
 */

public class Main {

	public static void main(String[] args) {
		
		TestObject a = new TestObject("a", 1003);
		FileIO.writeObject("a.txt", a);
		
		TestObject b = (TestObject) FileIO.readObject("a.txt");
		b.printProps();
		
	}

}
