// Write a java program to illustrate the internal frame in java swing.
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
import java.util.Scanner;

class InternalFrame extends JFrame { 
    static JFrame f; 
    static JLabel l, l1, l2, l3, l4, l5, l6, l7, l8; 
    public static void main(String[] args) { 
    	Scanner sc = new Scanner(System.in); 
    	f = new JFrame("Internal Frame"); 
    	f.setLayout(new FlowLayout());
        JInternalFrame inf = new JInternalFrame(); 
        inf.setTitle("Your Info");
        l1 = new JLabel("Name: ");
        l2 = new JLabel("Address: ");
        l3 = new JLabel("Age:");
        l4 = new JLabel("Sex: ");
        l5 = new JLabel();
        l6 = new JLabel();
        l7 = new JLabel();
        l8 = new JLabel();

    	String name, address, age, sex;
	    System.out.print("Enter your name: ");
	    name = sc.nextLine(); //reads string.
	    
	    System.out.print("Enter your address: ");
	    address = sc.nextLine(); //reads string.
	    
	    System.out.print("Enter your age: ");
	    age = sc.nextLine(); //reads string.

	    System.out.print("Enter your sex: ");
	    sex = sc.nextLine(); //reads string.


        JPanel p = new JPanel(); 
 
        p.add(l1); 
        p.add(l5);

        p.add(l2); 
        p.add(l6);

        p.add(l3);
        p.add(l7);

        p.add(l4);
        p.add(l8);


        l5.setText(String.valueOf(name));
        l6.setText(String.valueOf(address));
        l7.setText(String.valueOf(age));
        l8.setText(String.valueOf(sex));

        inf.setVisible(true); 
        inf.add(p);

        f.add(inf); 
        f.setSize(800, 300); 
  
        f.show(); 
    } 
} 