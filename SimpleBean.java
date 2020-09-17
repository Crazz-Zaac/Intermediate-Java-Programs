import java.awt.*;
import java.io.Serializable;
public class SimpleBean extends Canvas implements Serializable{
    public SimpleBean(){
        setSize(60, 40);
        setBackground(Color.red);
    }
}