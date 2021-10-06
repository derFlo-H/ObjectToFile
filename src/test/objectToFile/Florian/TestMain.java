package test.objectToFile.Florian;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import objectToFile.Florian.FileIO;

class TestMain {

	@Test
	void testFileInput() {
		assertTrue(FileIO.read("flo.txt") == "1234");
		
	}
	
	@Test
	void testFileOutput() {
		FileIO.write("len.txt","1234");
		assertTrue(FileIO.read("len.txt") == "1234");
		
	}

}
