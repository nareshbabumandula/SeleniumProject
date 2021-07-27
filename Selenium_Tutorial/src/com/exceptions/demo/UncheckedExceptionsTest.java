package com.exceptions.demo;

public class UncheckedExceptionsTest {
	
	public void UncheckedExceptionsExample() {
		boolean bFlag = false;
		try {
			//String sText = null;
			//System.out.println(sText.length()); // NullPointerException
			
			//String str = "hello";
			//int res = Integer.parseInt(str); // NumberFormatException
			//System.out.println(res); 
			
			int arr[] = new int[4];
			arr[0]=10;
			arr[1]=20;
			arr[2]=30;
			arr[3]=40;
			arr[4]=50;  // ArrayIndexOutOfBoundsException
			System.out.println(arr[3]);
			
			int a=10;
			int b=0;
			int c= a/b;
			System.out.println("Division of a and b is : "+c);
			bFlag = true;
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Executing ArrayIndexOutOfBoundsException catch block..!");
		}
		catch (Exception e) {
			System.out.println("Executing Exception catch block..!");
		}
		
		finally {
			if (bFlag) {
				System.out.println("No exception occured..!");
			} else {
				System.out.println("Exception occured in the try block..!");
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		UncheckedExceptionsTest et = new UncheckedExceptionsTest();
		et.UncheckedExceptionsExample();
		
	}

}
