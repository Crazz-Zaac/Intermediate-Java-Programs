// Write a Java program to throw custom exception explicitly using throw keyword in
// combination with throw keyword when employee age is negative.

import java.util.Scanner;

class SelfException{  
	void checkAge(int age)throws ArithmeticException{ 
		if (age < 0) 
			throw new ArithmeticException("Age cannot be negative");  
	}  
}  
class CustomException{  
   public static void main(String args[])throws ArithmeticException{
	   	SelfException obj = new SelfException();
	   	Scanner input = new Scanner(System.in);
	  	int age;
	  	System.out.println("Enter your age: ");
		age = input.nextInt();
	   	obj.checkAge(age);  
	    System.out.println("Validation completed");  
	}  
}