/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercomplaintmanagement;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GUNJAL
 */
public class clsrep {
    public ResultSet cmpasgbyemp(int ecode){
        ResultSet rs=null;
        try {
            dbutil.getcon();
            CallableStatement stm=dbutil.con.prepareCall("{call cmpasgbyemp(?)}");
            stm.setInt(1, ecode);
            rs=stm.executeQuery();
        } catch (IOException ex) {
            Logger.getLogger(clsrep.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clsrep.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(clsrep.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet cmpforcurmon(){
        ResultSet rs=null;
        try {
            dbutil.getcon();
            CallableStatement stm=dbutil.con.prepareCall("{call cmpforcurmon()}");
            rs=stm.executeQuery();
        } catch (IOException ex) {
            Logger.getLogger(clsrep.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clsrep.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(clsrep.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet empprfformon(){
        ResultSet rs=null;
        try {
            dbutil.getcon();
            CallableStatement stm=dbutil.con.prepareCall("{call empprfformon()}");
            rs=stm.executeQuery();
        } catch (IOException ex) {
            Logger.getLogger(clsrep.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clsrep.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(clsrep.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
