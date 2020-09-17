import javax.swing.*;
import java.awt.*;
import java.awt.event.*;       

class SimpleInterest extends JFrame implements ActionListener { //implement listener interface

	JTextField t1, t2, t3;
	JLabel l1, l2, l3, l4, l5;
	JButton b1; 
	public SimpleInterest() {
	  super("Simple Interest Calculator");
	  
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	  l1 = new JLabel("Enter Principal:");
	  l2 = new JLabel("Enter Time: ");
	  l3 = new JLabel("Enter Rate: ");
	  l4 = new JLabel("Rs: ");
	  l5 = new JLabel();
	  
	  t1 = new JTextField(10);
	  t2 = new JTextField(10);
	  t3 = new JTextField(10);
	  
	  b1 = new JButton("Calculate");
	  
	  setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
	  add(l1);
	  add(t1);
	  add(l2);
	  add(t2);
	  add(l3);
	  add(t3);
	  add(b1);
	  add(l4);
	  add(l5);

	  b1.addActionListener(this);//Registering event

		  setSize(400,300);
		  setVisible(true);
	}
	 
	public void actionPerformed(ActionEvent ae){ //Handle Event
		int p, t, r, si; 
		p = Integer.parseInt(t1.getText());   
		t = Integer.parseInt(t2.getText()); 
		r = Integer.parseInt(t3.getText());
		if(ae.getSource() == b1)
			si = (p*t*r)/100;
		else
			si = 0; 

		// t4.setText(String.valueOf(si));
		l5.setText(String.valueOf(si));
	}

	public static void main(String a []){
		new SimpleInterest();
	}
}
