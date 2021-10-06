package test.objectToFile.Florian;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import objectToFile.Florian.FileIO;

class TestMain {

	@Test
	void testFileRead() {
		assertTrue(FileIO.read("flo").equals("1234"));
		
	}
	
	@Test
	void testFileWrite() {
		FileIO.write("len.txt","1234");
		assertTrue(FileIO.read("len").equals("1234"));
		
	}

}
