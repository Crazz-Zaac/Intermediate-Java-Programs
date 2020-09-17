// Write a program to illustrate the use of throw keyword to throw the exception explicitly.
import java.util.Scanner;

class ThrowKeywordIllustration{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int arr[]={1, 2, 3, 0}, n1, pos;
		System.out.println("Enter an array position for division: ");
		pos = input.nextInt();	
		if(pos <= (arr.length - 1)){
			try{
				n1 = 100 / arr[pos];
				System.out.println("Quotient: "+ n1);
			}
			catch(ArithmeticException e){
				System.out.println("Division not possible.");
			}
		}
		else{
			throw new ArrayIndexOutOfBoundsException("Division failed.");
		}
		System.out.println("Operation completed.");
	}
}