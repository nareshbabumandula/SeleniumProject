package control.statements;

import java.util.Scanner;

public class IfTest {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    public void ifExample() {
    	if (a>b) {
   			System.out.println("a is greater than b");
		}
    }
    
    public void enhancedIf() {
    	if (a>b) System.out.println("a is greater than b");
    }
    
    
    public void ifElseExample() {
    	if (a>b) {
			System.out.println("a is greater than b");
			if (a>10) {
				System.out.println("a is greater than 10");
			}
		}else {
			System.out.println("a is less than b");
		}
    }
        
    public void ifElseIfElseExample() {
    	if (a>b) {
			System.out.println("a is greater than b");
		}else if(a==b){
			System.out.println("a and b are equal");
		}else {
			System.out.println("a is less than b");
		}
    }
    
  	public static void main(String[] args) {
		IfTest it = new IfTest();
		//it.ifExample();
		it.ifElseExample();
		//it.ifElseIfElseExample();
		//it.enhancedIf();
	}

}
