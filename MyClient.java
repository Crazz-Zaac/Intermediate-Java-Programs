import java.rmi.*;
public class MyClient{
    public static void main(String args[]){
        try{
            Adder a = (Adder)Naming.lookup("rmi://localhost:5002/as");
            int sum = a.add(34, 5);
            System.out.println("Sum of two numbers is: "+sum);
        }
        catch(Exception e){

        }
    }
}