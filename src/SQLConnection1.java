import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;


public interface SQLConnection1 {
    default Connection getConnection(String port, String password){
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:" + port + "/passwords";
            String username = "root";
            Class.forName(driver);

            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
            return con;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    default void setLogo(JFrame frame){
        Image icon = Toolkit.getDefaultToolkit().getImage("src\\Poor_Logo.JPG");
        frame.setIconImage(icon);
    }
}
