// Write a java GUI application program to illustrate the handling of action event.


import java.awt.*;  
// import java.awt.ImageIcon;
import java.awt.event.*;  
import javax.swing.*;

public class ActionEventHandling {  
    public static void main(String[] args) { 
    	JFrame f = new JFrame("Action Event handling");  
 		JLabel img = new JLabel(new ImageIcon("bomb.gif"));
        JPanel p = new JPanel(); 
        Button b = new Button("Click Here");  
        f.setLayout(new FlowLayout());
        b.setBounds(50,100,80,30);  
        f.add(b);        
        p.add(img);
        f.getContentPane().add(p);
        img.setVisible(false);

      
        b.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){ 
	        	if(e.getSource() == b){
	        		b.setVisible(false);
	        		img.setVisible(true);
	        	}
	        }  
        });  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setSize(600, 300);  
        f.setVisible(true);  
    }  
}  
    
   