// Write a java program to illustrate the nested try blocks

import java.util.Scanner;

class NestedTryBlock{  
    public static void main(String args[]){  
        Scanner input = new Scanner(System.in);
        int arr[]={1, 2, 3, 0}, n1, pos, n2;
        System.out.println("Enter an array position for division: ");
        pos = input.nextInt();  
        System.out.println("Enter an array position to display the value: ");
        n2 = input.nextInt();  
        try{  
            try{  
                n1 = 100 / arr[pos];  
            }
    		catch(ArithmeticException e){
    			System.out.println(e);
    		}  
            try{  
                System.out.println("Array value at "+n2+": "+arr[n2]);
            }
    		catch(ArrayIndexOutOfBoundsException e){
    		  System.out.println(e);
    		} 
            System.out.println("End of try statement");  
        }
    	catch(Exception e){
    	   System.out.println("Exception handled.");
    	}  

        System.out.println("Operation completed");  
    }  
}  