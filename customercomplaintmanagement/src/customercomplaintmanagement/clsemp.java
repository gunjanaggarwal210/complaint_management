/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercomplaintmanagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author GUNJAL
 */
public class clsemp implements intemp{

    @Override
    public void insemp(clsempprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call insemp(?,?,?,?,?)}");
        stm.setObject(1, null);
        stm.setString(2, p.getEmpname());
        stm.setString(3, p.getEmppic());
        stm.setString(4, p.getEmploc());
        stm.setString(5, p.getEmpphnno());
        stm.execute();
        dbutil.closecon();
    }

    @Override
    public void updemp(clsempprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call updemp(?,?,?,?,?)}");
        stm.setInt(1, p.getEmpcode());
        stm.setString(2, p.getEmpname());
        stm.setString(3, p.getEmppic());
        stm.setString(4, p.getEmploc());
        stm.setString(5, p.getEmpphnno());
        stm.execute();
        dbutil.closecon();
    }

    @Override
    public void delemp(clsempprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call delemp(?)}");
        stm.setInt(1, p.getEmpcode());
        stm.execute();
        dbutil.closecon();
    }

    @Override
    public clsempprp findemp(int ano) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        clsempprp p=new clsempprp();
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call findemp(?)}");
        stm.setInt(1, ano);
        ResultSet rs=stm.executeQuery();
        if(rs.next()){
            p.setEmpcode(rs.getInt("empcode"));
            p.setEmpname(rs.getString("empname"));
            p.setEmppic(rs.getString("emppic"));
            p.setEmploc(rs.getString("emploc"));
            p.setEmpphnno(rs.getString("empphnno"));
        }
        dbutil.closecon();
        return p;
    }

    @Override
    public ArrayList<clsempprp> disemp() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call disemp()}");
        ResultSet rs=stm.executeQuery();
        ArrayList<clsempprp> k=new ArrayList<clsempprp>();
        while(rs.next()){
            clsempprp p=new clsempprp();
            p.setEmpcode(rs.getInt("empcode"));
            p.setEmpname(rs.getString("empname"));
            p.setEmppic(rs.getString("emppic"));
            p.setEmploc(rs.getString("emploc"));
            p.setEmpphnno(rs.getString("empphnno"));
            k.add(p);
        }
        dbutil.closecon();
        return k;
    }

public ArrayList<clsempprp> disempbyloc(String loc) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        dbutil.getcon();
        CallableStatement stm=dbutil.con.prepareCall("{call disempbyloc(?)}");
        stm.setString(1, loc);
        ResultSet rs=stm.executeQuery();
        ArrayList<clsempprp> k=new ArrayList<clsempprp>();
        while(rs.next()){
            clsempprp p=new clsempprp();
            p.setEmpcode(rs.getInt("empcode"));
            p.setEmpname(rs.getString("empname"));
            p.setEmppic(rs.getString("emppic"));
            p.setEmploc(rs.getString("emploc"));
            p.setEmpphnno(rs.getString("empphnno"));
            k.add(p);
        }
        dbutil.closecon();
        return k;
    }    
}
