/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercomplaintmanagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author GUNJAL
 */
public interface intvst {
    public void insvst(clsvstprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public void updvst(clsvstprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public void delvst(clsvstprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public clsvstprp findvst(int ano) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public ArrayList<clsvstprp> disvst() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
}
