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
public class clsacc implements intacc{

    @Override
    public void insacc(clsaccprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call insacc(?,?,?,?,?,?,?)}");
        stm.setObject(1,null);
        stm.setString(2, p.getAccname());
        stm.setDate(3, (Date) p.getAccdate());
        stm.setString(4, p.getAccadd());
        stm.setString(5, p.getAccloc());
        stm.setString(6, p.getAccphnno());
        stm.setString(7, p.getAcctype());
        stm.execute();
        dbutil.closecon();
    }

    @Override
    public void updacc(clsaccprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call updacc(?,?,?,?,?,?,?)}");
        stm.setInt(1, p.getAccno());
        stm.setString(2, p.getAccname());
        stm.setDate(3, (Date) p.getAccdate());
        stm.setString(4, p.getAccadd());
        stm.setString(5, p.getAccloc());
        stm.setString(6, p.getAccphnno());
        stm.setString(7, p.getAcctype());
        stm.execute();
        dbutil.closecon();
    }

    @Override
    public void delacc(clsaccprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call delacc(?)}");
        stm.setInt(1, p.getAccno());
        stm.execute();
        dbutil.closecon();
    }

    @Override
    public clsaccprp findacc(int ano) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        clsaccprp p=new clsaccprp();
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call findacc(?)}");
        stm.setInt(1, ano);
        ResultSet rs=stm.executeQuery();
        if(rs.next()){
        p.setAccno(rs.getInt("accno"));
        p.setAccname(rs.getString("accname"));
        p.setAccdate(rs.getDate("accdate"));
        p.setAccadd(rs.getString("accadd"));
        p.setAccloc(rs.getString("accloc"));
        p.setAccphnno(rs.getString("accphnno"));
        p.setAcctype(rs.getString("acctype"));
    }
        dbutil.closecon();
        return p;
    }

    @Override
    public ArrayList<clsaccprp> disacc() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call disacc()}");
        ResultSet rs=stm.executeQuery();
        ArrayList<clsaccprp> k=new ArrayList<clsaccprp>();
        while(rs.next()){
            clsaccprp p=new clsaccprp();
            p.setAccno(rs.getInt("accno"));
            p.setAccname(rs.getString("accname"));
            p.setAccdate(rs.getDate("accdate"));
            p.setAccadd(rs.getString("accadd"));
            p.setAccloc(rs.getString("accloc"));
            p.setAccphnno(rs.getString("accphnno"));
            p.setAcctype(rs.getString("acctype"));
            k.add(p);
        }
        dbutil.closecon();
        return k;
    }
    
}
