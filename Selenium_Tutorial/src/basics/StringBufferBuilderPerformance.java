package basics;

public class StringBufferBuilderPerformance {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		StringBuffer sb = new StringBuffer("Hello");

		for (int i = 0; i < 10000; i++) {
			sb.append(" World");
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by StringBuffer class is : "+ (endTime-startTime) + " ms");

		long startTime1 = System.currentTimeMillis();

		StringBuilder sb1 = new StringBuilder("Hello");

		for (int i = 0; i < 10000; i++) {
			sb1.append(" World");
		}

		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken by StringBuilder class is : "+ (endTime1-startTime1) + " ms");


		long startTime2 = System.currentTimeMillis();

		String str = new String("Hello");

		for (int i = 0; i < 10000; i++) {
			str.concat( "World");
		}

		long endTime2 = System.currentTimeMillis();
		System.out.println("Time taken by String class is : "+ (endTime2-startTime2) + " ms");

	}


}
