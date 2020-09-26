// Write a program to CREATE and WRITE n numbers in a file “NUMBER.TXT”. 
// Open this file then read  its content and put all even numbers in one 
// file “EVEN.TXT” and odd numbers in another file “ODD.TXT”.

import java.io.File;  // Import the File class
import java.io.*;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;


public class OddEvenText{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
	  	int n;
	  	System.out.println("Enter the range of number: ");
		n = input.nextInt();
      	FileWriter fw1 = null;
      	FileWriter fw2 = null;
		try{
			FileWriter evenFile = new FileWriter("even.txt");
         	FileWriter oddFile = new FileWriter("odd.txt");
         	fw1 = new FileWriter("even.txt");
         	fw2 = new FileWriter("odd.txt");
         	for(int i = 0; i <= n; i++){
         		if (i % 2 == 0){
         			fw1.write(String.valueOf(i));
         			fw1.write(" ");
         		}
         		else{
         			fw2.write(String.valueOf(i));	
         			fw2.write(" ");
         		}
         	}
		}
		catch(IOException e){
         System.out.println(e);
         System.exit(-1);
	    }
	    finally{
	    	try{
	    		fw1.close();
	            fw2.close();
	        }
	        catch(IOException e){}
	     }
	}
}