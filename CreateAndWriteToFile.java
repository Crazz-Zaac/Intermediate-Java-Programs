// Write a java program to write character data in a file “Input.txt” 
// and then copy the character data in  “input.txt” file into “output.txt”.


import java.io.File;  // Import the File class
import java.io.*;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class CreateAndWriteToFile {
   public static void copyChar(){
      FileReader fr = null;
      FileWriter fw = null;
      try{
         fr = new FileReader("input.txt");
         fw = new FileWriter("output.txt");
         int ch;
         //FileReader Class which is subclass of InputSteamReader
         //InputStreamReader class converts Strings or character data
         //into Byte which are in form of integers. 
         //so ch is of int type
         while((ch = fr.read()) != -1){      //-1 indicates end-of-file (eof)
            fw.write(ch);
         }
      }
      catch(IOException e){
         System.out.println(e);
         System.exit(-1);
      }
      finally{
         try{
            fr.close();
            fw.close();
         }
         catch(IOException e){}
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter a text: ");
      String txt = sc.nextLine(); //reads string.
      try{
         // File inputFile = new File("input.txt");
         // File outputFile = new File("output.txt");
         FileWriter inputFile = new FileWriter("input.txt");
         FileWriter outputFile = new FileWriter("output.txt");
         System.out.println("File created.");
         inputFile.write(txt);
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
