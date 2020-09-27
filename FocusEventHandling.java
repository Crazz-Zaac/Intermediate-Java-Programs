// Write a java GUI application program to illustrate the handling of focus event.

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;

public class FocusEventHandling extends JFrame implements FocusListener {
	JButton b;
	JTextField t1, t2;
	JLabel l1, l2, l3, l4;
	public FocusEventHandling(){
		super("Focus and Handle Event");
		l1 = new JLabel("First number: ");
		l2 = new JLabel("Second number: ");
		l3 = new JLabel("Sum: ");
		l4 = new JLabel();

		t1 = new JTextField(10);
		t2 = new JTextField(10);

		b = new JButton("Calculate");

		t1.addFocusListener(this);
		t2.addFocusListener(this);
		b.addFocusListener(this);

		setSize(400, 400);
		setLayout(new FlowLayout(FlowLayout.LEFT, 150, 30));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
		add(l4);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void focusGained(FocusEvent fe){
		if(fe.getSource() == b){
			int n1, n2, n3;
			n1 = Integer.parseInt(t1.getText());
			n2 = Integer.parseInt(t2.getText());
			n3 = n1 + n2;
			l4.setText(String.valueOf(n3));
		}
	}

	public void focusLost(FocusEvent fe){
		if(fe.getSource() == t1 && t1.getText().equals("")){
			JOptionPane.showMessageDialog(this, "Uh-oh!", "Cannot accept empty value", JOptionPane.ERROR_MESSAGE);
			t1.requestFocus();
		}
		if(fe.getSource() == t2 && t2.getText().equals("")){
			JOptionPane.showMessageDialog(this, "Uh-oh!", "Cannot accept empty value", JOptionPane.ERROR_MESSAGE);
			t2.requestFocus();
		}
	}

	public static void main(String args[]){
		new FocusEventHandling();
	}
}