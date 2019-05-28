/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercomplaintmanagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author GUNJAL
 */
public class clscmp implements intcmp{

    @Override
    public int inscmp(clscmpprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call inscmp(?,?,?,?,?,?)}");
        //stm.setObject(1, null);
        stm.setInt(1, p.getCmpaccno());
        stm.setDate(2, (Date) p.getCmpdate());
        stm.setString(3, p.getCmpdsc());
        stm.setInt(4, p.getCmpasgempcode());
        stm.setString(5,String.valueOf(p.getCmpsts()));
        stm.registerOutParameter(6, Types.INTEGER);
        stm.execute();
        int a=stm.getInt(6);
        dbutil.closecon();
        return a;
    }

    @Override
    public void updcmp(clscmpprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call updcmp(?,?)}");
        stm.setInt(1, p.getCmpcode());
        stm.setString(2, String.valueOf(p.getCmpsts()));
        stm.execute();
        dbutil.closecon();
    }

    @Override
    public void delcmp(clscmpprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call delcmp(?)}");
        stm.setInt(1, p.getCmpcode());
        stm.execute();
        dbutil.closecon();
    }

    @Override
    public clscmpprp findcmp(int ano) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        clscmpprp p=new clscmpprp();
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call findcmp(?)}");
        stm.setInt(1, ano);
        ResultSet rs=stm.executeQuery();
        if(rs.next()){
            p.setCmpcode(rs.getInt("cmpcode"));
            p.setCmpaccno(rs.getInt("cmpaccno"));
            p.setCmpdate(rs.getDate("cmpdate"));
            p.setCmpdsc(rs.getString("cmpdsc"));
            p.setCmpasgempcode(rs.getInt("cmpasgempcode"));
            p.setCmpsts(rs.getString("cmpsts").charAt(0));
        }
        dbutil.closecon();
        return p;
    }

    @Override
    public ArrayList<clscmpprp> discmp() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call discmp()}");
        ResultSet rs=stm.executeQuery();
        ArrayList<clscmpprp> k=new ArrayList<clscmpprp>();
        while(rs.next()){
            clscmpprp p=new clscmpprp();
            p.setCmpcode(rs.getInt("cmpcode"));
            p.setCmpaccno(rs.getInt("cmpaccno"));
            p.setCmpdate(rs.getDate("cmpdate"));
            p.setCmpdsc(rs.getString("cmpdsc"));
            p.setCmpasgempcode(rs.getInt("cmpasgempcode"));
            p.setCmpsts(rs.getString("cmpsts").charAt(0));
            k.add(p);
        }
        dbutil.closecon();
        return k;
    }
    
}
