// Write a java swing program to illustrate the Input dialog.

import javax.swing.*;
class InputDialog{
	public static void MainWork(){
		JFrame f;
		String txt;
		f = new JFrame();   
    	txt = JOptionPane.showInputDialog(f,"Enter anything");  
    	System.out.println("You entered: "+txt);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		MainWork();
	}
}