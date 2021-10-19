package objectToFile.Florian;

import java.io.Serializable;

public class TestObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3085177378324579393L;
	public String s;
	public int i;
	
	public TestObject(String s, int i) {
		
		this.i = i;
		this.s = s;
				
	}
	
	public void printProps() {
		
		System.out.println("i : " + i);
		System.out.println("s : " + s);
		
	}
	
}
