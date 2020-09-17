// Write a program using try and catch block to handle exceptions. Also display the
// exception information on the console.
import java.util.Scanner;

class ExceptionHandled{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int n1, n2, res;
		System.out.println("Enter first number: ");
		n1 = input.nextInt();
		System.out.println("Enter second number: ");
		n2 = input.nextInt();

		try{
			res = n1 / n2;
			System.out.println("Quotient: "+res);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Execution completed..");
	}
}