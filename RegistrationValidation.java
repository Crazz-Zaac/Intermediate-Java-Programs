// Write a java program to check student eligibility for registration. If student age is less
// than 12 and weight is less than 40 then the student should get an ArithmeticException
// with the warning message “Student is not eligible for registration”, other wise student
// should get Student Entry is Valid message. throw the exception using throw keyword.

import java.util.Scanner;

public class RegistrationValidation {
  static void checkAge(int age, int weight) throws ArithmeticException {
    if (age < 12 && weight < 40) {
    	throw new ArithmeticException(" You are not eligible for the registration.");
    }
    else {
    	System.out.println("Your data is recorded.");
    }
  }
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
  	int age, weight;
  	System.out.println("Enter your age: ");
	age = input.nextInt();
	System.out.println("Enter your weight: ");
	weight = input.nextInt();
    checkAge(age, weight);
  }
}