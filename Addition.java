import javax.swing.*;
import java.awt.*;
import java.awt.event.*;       

class Addition extends JFrame implements ActionListener { //implement listener interface

	JTextField t1, t2, t3;
	JLabel l1, l2, l3, l4, l5;
	JButton b1; 
	public Addition() {
	  super("Adding two numbers");
	  
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	  l1 = new JLabel("First Number:");
	  l2 = new JLabel("Second Number: ");
	  l4 = new JLabel("Sum: ");
	  l5 = new JLabel();
	  
	  t1 = new JTextField(10);
	  t2 = new JTextField(10);
	  
	  b1 = new JButton("Calculate");
	  
	  setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
	  add(l1);
	  add(t1);

	  add(l2);
	  add(t2);
	  
	  // add(l3);
	  // add(t3);
	  add(b1);
	  add(l4);
	  add(l5);

	  b1.addActionListener(this);//Registering event
	  setSize(400,300);
	  setVisible(true);
	}
	 
	public void actionPerformed(ActionEvent ae){ //Handle Event
		Double n1, n2, pr; 
		n1 = Double.parseDouble(t1.getText());   
		n2 = Double.parseDouble(t2.getText()); 
		if(ae.getSource() == b1)
			pr = n1 + n2;
		else
			pr = 0.0; 

		// t4.setText(String.valueOf(si));
		l5.setText(String.valueOf(pr));
	}

	public static void main(String a []){
		new Addition();
	}
}