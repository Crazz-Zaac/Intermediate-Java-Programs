//Write a java swing program to illustrate the creation of progress bar in java swing.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ProgressBar extends Thread{

	public static void main(String args[]){ 		
		final int MAX = 100;
        final JFrame frame = new JFrame("File copying");
 		JLabel l1 = new JLabel();
 		JLabel img = new JLabel(new ImageIcon("copy.gif"));
        final JProgressBar pb = new JProgressBar();
        JPanel p = new JPanel();

        pb.setMinimum(0);
        pb.setMaximum(MAX);
        pb.setStringPainted(true);
 
        // add progress bar
        frame.setLayout(new FlowLayout());
        p.add(img);
	    frame.getContentPane().add(p);
        frame.getContentPane().add(pb);
        frame.add(l1);
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setVisible(true);
 
        // update progressbar
        for (int i = 0; i <= MAX; i++) {
            final int currentValue = i;
            try {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        pb.setValue(currentValue);
                    }
                });
                java.lang.Thread.sleep(200);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(frame, e.getMessage());
            }
        }
        img.setVisible(false);
        l1.setText(String.valueOf("File copying 100% completed"));
    }
}