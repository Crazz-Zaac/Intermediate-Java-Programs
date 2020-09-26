// Write a java swing program to illustrate the Option dialog.
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
  
class MainWork extends WindowAdapter implements ActionListener { 
    JTextField t1, t2, t3;
    JFrame f;
    JLabel l1, l2, l3, l4, l5;
    JButton b1;
    MainWork(){
    	f = new JFrame(); 
    	f.setBounds(200, 200, 400, 300); 
        f.setSize(400,300);  
        f.setVisible(true);
    	f.addWindowListener(this); 
        f.setTitle("Adding two numbers");
        f.setDefaultCloseOperation(f.DO_NOTHING_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.LEFT,150,10));

        l1 = new JLabel("First Number:");
        l2 = new JLabel("Second Number: ");
        l4 = new JLabel("Sum: ");
        l5 = new JLabel();
          
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        
        b1 = new JButton("Calculate");

        b1.setBounds(130, 05, 100, 50); 

        f.add(l1);
        f.add(t1);

        f.add(l2);
        f.add(t2);
          
        f.add(b1);
        f.add(l4);
        f.add(l5);

        f.add(b1); 
        b1.addActionListener(this); 

    }  
    public void actionPerformed(ActionEvent evt){ 
        Double n1, n2, pr; 
        n1 = Double.parseDouble(t1.getText());   
        n2 = Double.parseDouble(t2.getText());
        if (evt.getSource() == b1){ 
            pr = n1 + n2;
            l5.setText(String.valueOf(pr));
            JOptionPane.showMessageDialog(f, "Operation complete", 
                "SUCCESS", JOptionPane.INFORMATION_MESSAGE);    
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        }
    }

    public void windowClosing(WindowEvent we){
    	int opt = JOptionPane.showConfirmDialog(f, "Are you sure?");  
		if(opt == JOptionPane.YES_OPTION){  
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
    }
} 
  
class OptionDialog{ 
    public static void main(String args[]) {
        new MainWork();  
    } 
} 