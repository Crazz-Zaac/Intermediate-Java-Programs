// Write a program to create a file student and store the information of student 
// in this file and then read the student information from this file and display 
// on console

import java.io.File;  // Import the File class
import java.io.*;
import java.io.BufferedWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class StudentInfo{
	public static void displayContent(){
      try{
      	FileReader fr = new FileReader("studentinfo.txt");
        BufferedReader br = new BufferedReader(fr);
        StringBuffer sb = new StringBuffer();
        String line;
        while((line = br.readLine()) != null){
        	System.out.println(line);
        }
      }
      catch(IOException e){
         System.out.println(e);
         System.exit(-1);
      }
   }

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		String name, address, roll, faculty;
	    try{
	        FileWriter inputFile = new FileWriter("studentinfo.txt");
	        for(int i = 0; i <= 3; i++){
	        	System.out.print("Enter your name: ");
		    	name = sc.nextLine(); //reads string.
		    	inputFile.write(name+"\t");
		    	
		    	System.out.print("Enter your address: ");
		    	address = sc.nextLine(); //reads string.
		    	inputFile.write(address+"\t");

		    	System.out.print("Enter your roll number: ");
		    	roll = sc.nextLine(); //reads string.
		    	inputFile.write(roll+"\t");

		    	System.out.print("Enter your faculty: ");
		    	faculty = sc.nextLine(); //reads string.
		    	inputFile.write(faculty+"\n");
		    	System.out.println();

	        }
	        inputFile.close();
	    } 
	    catch (IOException e) {
	    	System.out.println("An error occurred while creating/reading a file.");
	        e.printStackTrace();
	    }
	    System.out.println("Content inside the file:");
	    displayContent();
	}
}