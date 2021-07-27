package basics;

public class StringBufferTest {
	
	/*
	 * StringBuffer classes are mutable and synchronized 
	 */
	
	public void StringBufferExample(String sText) {
		
		StringBuffer sb = new StringBuffer(sText);
		sb.append(" ");
		sb.append("Mehta");
		System.out.println(sb);
		
	}

	public static void main(String[] args) {
		
		StringBufferTest sbt = new StringBufferTest();
		sbt.StringBufferExample("Gunjan");
	}

}
