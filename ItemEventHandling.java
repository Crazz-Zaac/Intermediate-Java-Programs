//Write a java GUI application program to illustrate the handling of item event.


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ItemEventHandling extends JFrame implements ItemListener{
	JTextField t1;
	JLabel l1, l2;
	Font myFontIt, myFontBl;
	JCheckBox bold, italic;

	public ItemEventHandling(){
		super("Font selector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 150, 10));

		t1 = new JTextField(10);
		t1.setPreferredSize( new Dimension( 200, 24 ) );
		l1 = new JLabel();
		bold = new JCheckBox("BOLD");
		bold.setBounds(100,100, 50,50); 
		italic = new JCheckBox("ITALIC");
		italic.setBounds(100,100, 50,50); 

		myFontBl = new Font("Serif", Font.BOLD, 12);
		myFontIt = new Font("Serif", Font.ITALIC, 12);


		add(t1);
		add(bold);
		add(italic);
		add(l1);

		bold.addItemListener(this);    
        italic.addItemListener(this);

		setSize(400, 300);
	    setVisible(true);

	}

	public void itemStateChanged(ItemEvent e) { 
		String txt = "";     
        if(e.getSource() == bold){
        	txt = txt + t1.getText();
        	l1.setText(String.valueOf(txt));
        	l1.setFont(myFontBl);
        }

        if(e.getSource() == italic){
        	txt = txt + t1.getText();
        	l1.setText(String.valueOf(txt));
        	l1.setFont(myFontBltIt);
        }        	
    }  

	public static void main(String args[]) {
	  	new ItemEventHandling();
	}
}
