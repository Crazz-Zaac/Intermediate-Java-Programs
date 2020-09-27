// Write a java GUI application program to illustrate the handling of  window event.

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;	

public class WindowEventHandling extends JFrame implements WindowListener{
	WindowEventHandling(){
		super("Handling Window Event");
		JLabel img = new JLabel(new ImageIcon("window.gif"));
		JPanel p = new JPanel(); 

		addWindowListener(this);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.add(img);
		getContentPane().add(p);
		setSize(600, 400);
		setVisible(true);
	}

	public void windowActivated(WindowEvent we){
		System.out.println("Window active");
	}

	public void windowClosed(WindowEvent we){
		System.out.println("Window closed");
	}	

	public void windowClosing(WindowEvent we){
		System.out.println("Window closing");
	}

	public void windowDeactivated(WindowEvent we){
		System.out.println("Window deactivated");
	}

	public void windowIconified(WindowEvent we){
		System.out.println("Window iconified");
	}

	public void windowDeiconified(WindowEvent we){
		System.out.println("Window deiconified");
	}

	public void windowOpened(WindowEvent we){
		System.out.println("Window opened");
	}

	public static void main(String args[]){
		new WindowEventHandling();
	}
}