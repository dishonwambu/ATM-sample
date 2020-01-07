import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
public class Connector {
Connection conn=null; 
   
   public static Connection connection(){
   try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Details?zeroDateTimeBehavior=convertToNull","root","");
       return conn;
   }catch(Exception e){
       JOptionPane.showMessageDialog(null,e);
       System.exit(0);
   }
   return null;
   }
}
