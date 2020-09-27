// Write a java GUI application program to illustrate the handling of mouse event.

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MouseEventHandling implements MouseListener {
	int x, y, rad1, rad2;
	JFrame f;
	MouseEventHandling(){
		f = new JFrame("Handling Mouse Event");
		f.addMouseListener(this);
		f.setSize(500, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
	}
	public void mouseClicked(MouseEvent e){
		x = e.getX();
		y = e.getY();
		rad1 = 60;
		rad2 = 70;
		Graphics g = f.getGraphics();
		g.drawOval(x, y, rad1, rad2);
	}
	public void mouseEntered(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}

	public static void main(String args[]){
		new MouseEventHandling();
	}

}