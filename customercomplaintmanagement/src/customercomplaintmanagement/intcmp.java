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
public interface intcmp {
    public int inscmp(clscmpprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public void updcmp(clscmpprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public void delcmp(clscmpprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public clscmpprp findcmp(int ano) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public ArrayList<clscmpprp> discmp() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
}
