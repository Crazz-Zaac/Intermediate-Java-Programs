// Write a java swing program to illustrate the Message dialog.

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
  
class MainWork extends JFrame implements ActionListener  { 
    JTextField t1, t2, t3;
    JLabel l1, l2, l3, l4, l5;
    JButton b1;
    MainWork(){ 
        super("Adding two numbers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.LEFT,150,10));

        l1 = new JLabel("First Number:");
        l2 = new JLabel("Second Number: ");
        l4 = new JLabel("Sum: ");
        l5 = new JLabel();
          
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        
        b1 = new JButton("Calculate");

        b1.setBounds(130, 05, 100, 50); 

        this.add(l1);
        this.add(t1);

        this.add(l2);
        this.add(t2);
          
        this.add(b1);
        this.add(l4);
        this.add(l5);

        this.add(b1); 
        b1.addActionListener(this); 

    }  
    public void actionPerformed(ActionEvent evt){ 
        Double n1, n2, pr; 
        n1 = Double.parseDouble(t1.getText());   
        n2 = Double.parseDouble(t2.getText());
        if (evt.getSource() == b1){ 
            pr = n1 + n2;
            l5.setText(String.valueOf(pr));
            JOptionPane.showMessageDialog(this, "Operation complete", 
                "SUCCESS", JOptionPane.INFORMATION_MESSAGE);    
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    } 
} 
  
class MessageDialogs{ 
    public static void main(String args[]) {
        MainWork f = new MainWork(); 
        f.setBounds(200, 200, 400, 300); 
        f.setResizable(false);  
        f.setVisible(true); 
    } 
} 