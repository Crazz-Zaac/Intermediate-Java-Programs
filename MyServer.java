import java.rmi.*;
import java.rmi.registry.*;
public class MyServer{
    public static void main(String args[]){
        try{
            Adder AdderObject = new AdderRemote();
            Naming.rebind("rmi://localhost:5002/as", AdderObject);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}