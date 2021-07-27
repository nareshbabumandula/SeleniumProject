package basics;

public class StringManipulationTest {
	
	String sText1 = "hello";
	String sText2 = "WORLD";
	String sText3 = "hello welcome to core java training";
	String sText4 = "The Java Tutorials have been written for JDK 8. Examples and practices "
			+ "described in this page don't take advantage of improvements introduced in "
			+ "later releases and might use technology no longer available";
	String sText5 = "       welcome to selenium training                    ";
	
	public void stringMethods() {
		System.out.println(sText1.hashCode());
		sText1 = "hi";
		System.out.println(sText1.hashCode());
		
		System.out.println(sText1.toUpperCase());
		System.out.println(sText2.toLowerCase());
		System.out.println(sText3.length());
		System.out.println(sText4.charAt(0));
		System.out.println(sText5.trim());
		System.out.println(sText1.indexOf('o'));
		System.out.println(sText3.lastIndexOf('o'));
		System.out.println(sText3.replaceAll("training", "online training"));	
		System.out.println(sText4.contains("technology"));
		System.out.println(sText1.equals("hello"));
		System.out.println(sText2.equalsIgnoreCase("world"));
		System.out.println(sText3.startsWith("hello"));
		System.out.println(sText4.endsWith("available"));
		System.out.println(sText1.hashCode());
		System.out.println(sText4.length());
		System.out.println(sText4.substring(0, 200));
		
		String[] asText  = sText4.split(" ");
		System.out.println("No of elements in the array asText are : " + asText.length);
		System.out.println(asText[0]);
		System.out.println(asText[1]);
		System.out.println(asText[2]);
		System.out.println(asText[3]);
				
		for (String element : asText) {
			System.out.println(element);
		}
		
		String result = sText4.join(">", asText); // Join the array element with '>' symbol
		System.out.println(result);
		
		System.out.println(sText1.concat(sText2));
		System.out.println(sText1.concat(" ").concat(sText2.toLowerCase()));
		
		String sText5 = "welcome";
		System.out.println(sText5.length());
		
		for (int i = sText5.length(); i-->0;) {
			System.out.print(sText5.charAt(i));
		}
		System.out.println(" ");
		
		System.out.println(sText1.compareTo("hello1"));
		System.out.println(sText2.isEmpty());
	
		char[] res = sText1.toCharArray();
		for (char c : res) {
			System.out.println(c);
		}
		String r="";
		for (int i=res.length-1;i>=0;i--) {
			r+=res[i];
		}
		System.out.println(r);
	
	}

	public static void main(String[] args) {
		StringManipulationTest sm = new StringManipulationTest();
		sm.stringMethods();


	}

}
