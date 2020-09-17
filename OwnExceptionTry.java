// Write a program to throw your own exception (i. e. user define exception) and handle it.
import java.util.Scanner;

class OwnException extends Exception{
	String s1;
	OwnException(String s2){
		s1 = s2;
	}
	public String toString(){
		return ("Error: "+s1);
	}
}

class OwnExceptionTry{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
	    int arr[]={1, 2, 3, 0}, n1, pos;
	    System.out.println("Enter an array position for division: ");
	    pos = input.nextInt(); 
		try{
			if(pos <= (arr.length - 1)){
				n1 = 100 / arr[pos];
				System.out.println("Quotient: "+ n1);	
			}
			else{
				throw new OwnException("Attemplting for illegal division");
			}
		}
		catch(OwnException e){
			// System.out.println("this is catch block");
			System.out.println(e);
		}
	}
}