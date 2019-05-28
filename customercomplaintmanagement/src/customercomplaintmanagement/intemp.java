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
public interface intemp {
    public void insemp(clsempprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public void updemp(clsempprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public void delemp(clsempprp p) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public clsempprp findemp(int ano) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
    public ArrayList<clsempprp> disemp() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;
}
