    import javax.swing.JTextField;  
    import javax.swing.JFrame;  
      
    import java.awt.FlowLayout;  
    import java.awt.Font;  
      
    public class SetJTextFieldTextBoldAndItalic  
    {  
    public static void main(String[]args)  
    {  
     //Create text field using JTextField  
     JTextField textField=new JTextField(20);  
      
     //Create font.  
     //Font Name : Default text field font  
     //Font Style : Bold And Italic  
     //Font Size : Default text field font size  
     Font newTextFieldFont=new Font(textField.getFont().getName(),Font.ITALIC+Font.BOLD,textField.getFont().getSize());  
      
     //Set JTextField font using new created font  
     textField.setFont(newTextFieldFont);  
      
     //Create a window using JFrame with title ( Set JTextField text bold and italic )  
     JFrame frame=new JFrame("Set JTextField text bold and italic");  
      
     //Set JFrame layout to FlowLayout  
     frame.setLayout(new FlowLayout());  
      
     //Add created text field into JFrame  
     frame.add(textField);  
      
     //Set default close operation for JFrame  
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      
     //Set JFrame size  
     frame.setSize(400,100);  
      
     //Make JFrame visible  
     frame.setVisible(true);  
    }  
    }  