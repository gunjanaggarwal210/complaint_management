/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercomplaintmanagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author GUNJAL
 */
public class dbutil {
    static Connection con;
    public static void getcon() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        if(con==null){
            FileInputStream fis;
            fis=new FileInputStream("config.properties");
            Properties prp=new Properties();
            prp.load(fis);
            fis.close();
            Class.forName(prp.getProperty("driver"));
            con=DriverManager.getConnection(prp.getProperty("url"),prp.getProperty("uname"),"");
        }
    }
    
    public static void closecon() throws SQLException{
        if(con==null)
            return;
        else{
            con.close();
            con=null;
        }
    }
}
