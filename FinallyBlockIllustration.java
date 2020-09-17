//Write a program to illustrate the use of finally block in exception handling .
import java.util.Scanner;

class FinallyBlockIllustration{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int arr[]={1, 2, 3, 0}, n1, pos;
		System.out.println("Enter an array position for division: ");
		pos = input.nextInt();
		try{
			n1 = 100 / arr[pos];
			System.out.println("Quotient: "+n1);
		}
		catch(ArrayIndexOutOfBoundsException c){
			System.out.println("Array index out of range.");
		}
		finally{
			// b = 24/a[2];
			System.out.println("Operation completed.");
		}
	}
}