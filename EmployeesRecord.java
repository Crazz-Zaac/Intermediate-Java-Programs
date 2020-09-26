// Write a program to read ID, name, address and salary of five emplpyees and 
// write it into the file “emp.doc”. Again read records of the employees and display 
// records of  those employees whose salary is more than 25000.

import java.io.File;  // Import the File class
import java.io.*;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;


public class EmployeesRecord{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in); 
		String name, address;
		Integer id;
		Double salary;
		try{
			FileWriter inputFile = new FileWriter("emp.doc");
			FileWriter outputFile = new FileWriter("output.txt");
			System.out.println("File created...");
			for(int i = 0; i <= 5; i++){
				System.out.print("Name: ");
				String name = input.nextLine(); //reads string.
				
				System.out.print("Name: ");
				String  address = input.nextLine(); //reads string.
				
				System.out.println("Id: ");
				id = input.nextInt();

				System.out.println("Id: ");
				salary = input.nextDouble();
			}
			inputFile.close();
			System.out.println("Written to the file.");
		} 
		catch (IOException e) {
			System.out.println("An error occurred while creating/reading a file.");
			e.printStackTrace();
		}
		System.out.println("Copying character to output.txt");
		copyChar();
	}
}