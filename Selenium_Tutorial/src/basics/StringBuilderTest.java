package basics;

public class StringBuilderTest {
	
	/*
	 * StringBuffer classes are mutable and synchronized 
	 */
	
	public void StringBuilderExample(String sText) {
		
		StringBuilder sb = new StringBuilder(sText);
		sb.append(" ");
		sb.append("Mehta");
		System.out.println(sb);
			
	}

	public static void main(String[] args) {
		
		StringBuilderTest sbt = new StringBuilderTest();
		sbt.StringBuilderExample("Gunjan");
	}

}
