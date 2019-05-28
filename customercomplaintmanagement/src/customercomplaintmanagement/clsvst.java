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
import java.util.ArrayList;

/**
 *
 * @author GUNJAL
 */
public class clsvst implements intvst{

    @Override
    public void insvst(clsvstprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call insvst(?,?,?,?,?)}");
        stm.setObject(1, null);
        stm.setDate(2, (Date) p.getVstdate());
        stm.setInt(3, p.getVstcmpcode());
        stm.setString(4, p.getVstdsc());
        stm.setInt(5, p.getVstfeed());
        stm.execute();
        dbutil.closecon();
    }

    @Override
    public void updvst(clsvstprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call updvst(?,?,?,?,?)}");
        stm.setInt(1, p.getVstcode());
        stm.setDate(2, (Date) p.getVstdate());
        stm.setInt(3, p.getVstcmpcode());
        stm.setString(4, p.getVstdsc());
        stm.setInt(5, p.getVstfeed());
        stm.execute();
        dbutil.closecon();
    }

    @Override
    public void delvst(clsvstprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call delvst(?)}");
        stm.setInt(1, p.getVstcode());
        stm.execute();
        dbutil.closecon();
    }

    @Override
    public clsvstprp findvst(int ano) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        clsvstprp p=new clsvstprp();
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call findvst(?)}");
        stm.setInt(1, ano);
        ResultSet rs=stm.executeQuery();
        if(rs.next()){
            p.setVstcode(rs.getInt("vstcode"));
            p.setVstdate(rs.getDate("vstdate"));
            p.setVstcmpcode(rs.getInt("vstcmpcode"));
            p.setVstdsc(rs.getString("vstdsc"));
            p.setVstfeed(rs.getInt("vstfeed"));
        }
        dbutil.closecon();
        return p;
    }

    @Override
    public ArrayList<clsvstprp> disvst() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call disvst()}");
        ResultSet rs=stm.executeQuery();
        ArrayList<clsvstprp> k=new ArrayList<clsvstprp>();
        while(rs.next()){
            clsvstprp p=new clsvstprp();
            p.setVstcode(rs.getInt("vstcode"));
            p.setVstdate(rs.getDate("vstdate"));
            p.setVstcmpcode(rs.getInt("vstcmpcode"));
            p.setVstdsc(rs.getString("vstdsc"));
            p.setVstfeed(rs.getInt("vstfeed"));
            k.add(p);
        }
        dbutil.closecon();
        return k;
    }
    
}
