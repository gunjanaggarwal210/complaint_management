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
public interface intacc {
    public void insacc(clsaccprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public void updacc(clsaccprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public void delacc(clsaccprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public clsaccprp findacc(int ano) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public ArrayList<clsaccprp> disacc() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
}
