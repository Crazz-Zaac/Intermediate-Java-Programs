import javax.swing.*;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;  
import java.awt.Graphics;     
import java.applet.Applet;     


class FontStyle extends JFrame{ //implement listener interface

	JTextField t1;
	JLabel l1, l2, l3;
	JCheckBox bold, italic;
	Font myFont;
	// JButton b1; 
	public FontStyle(Graphics g) {
	  super("Font style change");
	  
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	  l1 = new JLabel("Type text:");
	  l2 = new JLabel("Result: ");
	  l3 = new JLabel("");
	  
	  t1 = new JTextField(10);
	  
	  bold = new JCheckBox("Bold");
	  italic = new JCheckBox("Italic");

	  
	  setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
	  add(l1);
	  add(t1);

	  add(bold);
	  add(italic);

	  add(l2);
	  add(l3);


	  bold.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                l3.setText("Bold: " + (e.getStateChange()==1?"checked":"unchecked"));    
                Font courierBold = new Font("Courier", Font.Bold, 40);
                g.setColor(Color.red);
                g.setFont(courierBold);
                g.drawString(t1.getText(), 120, 120);
             }    
          });    

      italic.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                l3.setText("Italic: "+ (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          });   

	  setSize(400,300);
	  setVisible(true);
	}
	 

	public static void main(String a []){
		new FontStyle();
	}
}
