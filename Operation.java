import javax.swing.*;
import java.awt.*;
import java.awt.event.*;       

class Operation extends JFrame implements ActionListener { //implement listener interface

	JTextField t1, t2, t3;
	JLabel l1, l2, l3, l4, l5;
	JButton b1, b2, b3, b4; 
	public Operation() {
	  super("Operation on two numbers");
	  
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	  l1 = new JLabel("First Number:");
	  l2 = new JLabel("Second Number: ");
	  // l3 = new JLabel("Enter Rate: ");
	  l4 = new JLabel("Result: ");
	  l5 = new JLabel();
	  
	  t1 = new JTextField(10);
	  t2 = new JTextField(10);
	  // t3 = new JTextField(10);
	  
	  b1 = new JButton("Add");
	  b2 = new JButton("Multiply");
	  b3 = new JButton("Subtract");
	  b4 = new JButton("Divide");
	  
	  setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
	  add(l1);
	  add(t1);

	  add(l2);
	  add(t2);
	  
	  // add(l3);
	  // add(t3);
	  add(b1);
	  add(b2);
	  add(b3);
	  add(b4);

	  add(l4);
	  add(l5);

	  b1.addActionListener(this);//Registering event
	  b2.addActionListener(this);//Registering event
	  b3.addActionListener(this);//Registering event
	  b4.addActionListener(this);//Registering event

		  setSize(400,300);
		  setVisible(true);
	}
	 
	public void actionPerformed(ActionEvent ae){ //Handle Event
		Double n1, n2, pr=0.0; 
		n1 = Double.parseDouble(t1.getText());   
		n2 = Double.parseDouble(t2.getText()); 
		if(ae.getSource() == b1)
			pr = n1 + n2;

		else if(ae.getSource() == b2)
			pr = n1 * n2;

		else if(ae.getSource() == b3)
			pr = n1 - n2;
		
		else if(ae.getSource() == b4){
			try{
				pr = n1 / n2;
			}
			catch(ArithmeticException e){  
            	// System.out.println(e);  
            	l5.setText(String.valueOf(e));
            } 
        } 
		else
			pr = 0.0; 

		// t4.setText(String.valueOf(si));
		l5.setText(String.valueOf(pr));
	}

	public static void main(String a []){
		new Operation();
	}
}
