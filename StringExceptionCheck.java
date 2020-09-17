// Define an exception called “NotMathchException” that is thrown when a string in not
// equal to “Nepal”. Write a program that uses this exception.

import java.util.Scanner;

class NotMathchException extends Exception{  
  NotMathchException(String s){ 
    super(s);  
  } 
}  

class StringExceptionCheck{  
  static void validateString(String s)throws NotMathchException{  
    if(s != "Nepal")  
      throw new NotMathchException("Sorry it's not supported in your country");  
    else  
      System.out.println("Welcome to heaven on earth, Nepal");  
  }  
  public static void main(String args[]){ 
    try{
      validateString("Nepal");		  
    }

    catch(Exception m){
      System.out.println("Exception occured: "+m);
    }
    
    System.out.println("Checking completed.");  
  }  
} 