// Write a program to illustrate the use of throws in exception handling.
import java.util.Scanner;

public class ThrowsInExceptionHandling {
  static void checkPos(int pos, int length, int[] arr) throws ArrayIndexOutOfBoundsException {
    int n1; 
    if (pos <= (length - 1)) {
      n1 = 100 / arr[pos];
      System.out.println("Quotient: "+n1);
    }
    else {
      throw new ArrayIndexOutOfBoundsException("Divison denied - Position must be within array length");
    }
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arr[]={1, 2, 3, 0}, n1, pos;
    System.out.println("Enter an array position for division: ");
    pos = input.nextInt();  
    checkPos(pos, arr.length, arr);
  }
}