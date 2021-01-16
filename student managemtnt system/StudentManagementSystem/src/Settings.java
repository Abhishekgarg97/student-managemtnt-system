

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Settings {
    static Statement get;
    public static Dimension getScreenSize(){
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        return d;   
    }//getScreenSize() closed
    
    public static Connection getDBConnection(){
        Connection con;
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:test");
            return con;
        }catch(Exception ex){
            return null;
        }
    }
}//class closed
