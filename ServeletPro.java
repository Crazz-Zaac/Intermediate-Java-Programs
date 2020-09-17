import java.io.*;
import javax.servelet.*;

public class ServeletPro implements Servelet{
    ServeletConfig config = null;

    public void init(ServeletConfig config){
        this.config = config;
        System.out.println("Servelet initialized");
    }

    public void service(ServeletRequest req, ServeletResponse res) throws IOException, ServeletException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.print("<html><body>");
        pw.print("<b>hello simple servelet </b>");
        pw.print("</body></html>");
    }

    public void destroy(){ }
    public ServeletConfig getServeletConfig(){
        return config;
    }

    public String getServeletInfo(){
        return "This servelet is created by implementing Servelet interface";
    }

}
