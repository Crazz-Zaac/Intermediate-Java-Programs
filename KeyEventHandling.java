//Write a java GUI application program to illustrate the handling of key event.

import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;

public class KeyEventHandling extends JFrame implements KeyListener {
	JLabel l;
	JTextArea area;
	KeyEventHandling(){
		super("Key Even Handler");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		l = new JLabel();  
		l.setBounds(20,50,200,20);  
		area=new JTextArea();  
		area.setBounds(20,80,300, 300);  
		area.addKeyListener(this);  
		this.add(l);
		this.add(area);  
		this.setSize(400,400);  
		this.setLayout(null);  
		this.setVisible(true);
	}

	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {  
		String text=area.getText();  
		String words[]=text.split("\\s");  
		l.setText("Words: "+words.length+" Characters:"+text.length());  
	} 
	public void keyTyped(KeyEvent e) {}

	public static void main(String args[]){
		new KeyEventHandling();
	}
}
