// Write a java program with try catch block. Enclose the code that may generate
// ArithmeticException in try block and resolve the exception in catch block.

import java.util.Scanner;

class ArithmeticExceptionHandling{
	public static void main(String []args){
		int a,b;
		try{
			a=0;
			b=24/a;
			System.out.println("This is not possible");
		}
		catch(ArithmeticException e){
			System.out.println("Division by 0 not possible");
		}
		System.out.println("Out of Catch keyword");
	}
}