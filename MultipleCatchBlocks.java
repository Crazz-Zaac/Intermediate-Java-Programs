// Write a program with multiple catch blocks that are used to handle exceptions generated
// by a single block of code.

import java.util.Scanner;

class MultipleCatchBlocks{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int arr[]={1, 2, 3, 0}, n1, pos;
		System.out.println("Enter an array position for division: ");
		pos = input.nextInt();
		try{
			n1 = 100 / arr[pos];
			System.out.println("Quotient: "+n1);
		}
		catch(ArithmeticException e){
			System.out.println("Division not possible");
		}
		catch(ArrayIndexOutOfBoundsException c){
			System.out.println("Array index out of range.");
		}
		System.out.println("Operation completed.");
	}
}