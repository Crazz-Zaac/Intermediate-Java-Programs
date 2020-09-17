import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Font;

public class SetJLabelTextBoldAndItalic
{
public static void main(String[]args)
{
 //Create label using JLabel with text ( HI EVERYONE !! I love you all )
 JLabel label=new JLabel("HI EVERYONE !! I love you all",SwingConstants.CENTER);

 //Create font.
 //Font Name : Default label font
 //Font Style : Bold And Italic
 //Font Size : Default label font size
 Font newLabelFont=new Font(label.getFont().getName(),Font.ITALIC+Font.BOLD,label.getFont().getSize());

 //Set JLabel font using new created font
 label.setFont(newLabelFont);

 //Create a window using JFrame with title ( Set JLabel text bold and italic )
 JFrame frame=new JFrame("Set JLabel text bold and italic");

 //Set JFrame layout to BorderLayout
 frame.setLayout(new BorderLayout());

 //Add created label into JFrame
 frame.add(label);

 //Set default close operation for JFrame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 //Set JFrame size
 frame.setSize(400,200);

 //Make JFrame visible
 frame.setVisible(true);
}
}