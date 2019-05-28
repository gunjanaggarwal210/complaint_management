/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercomplaintmanagement;

import java.util.Date;

/**
 *
 * @author GUNJAL
 */
public class clscmpprp {
    private int cmpcode;
    private int cmpaccno;
    private Date cmpdate=new Date();
    private String cmpdsc;
    private int cmpasgempcode;
    private char cmpsts;

    public Date getCmpdate() {
        return new java.sql.Date(cmpdate.getTime());
    }

    public void setCmpdate(Date cmpdate) {
        this.cmpdate = cmpdate;
    }

    public int getCmpcode() {
        return cmpcode;
    }

    public void setCmpcode(int cmpcode) {
        this.cmpcode = cmpcode;
    }

    public int getCmpaccno() {
        return cmpaccno;
    }

    public void setCmpaccno(int cmpaccno) {
        this.cmpaccno = cmpaccno;
    }

    public String getCmpdsc() {
        return cmpdsc;
    }

    public void setCmpdsc(String cmpdsc) {
        this.cmpdsc = cmpdsc;
    }

    public int getCmpasgempcode() {
        return cmpasgempcode;
    }

    public void setCmpasgempcode(int cmpasgempcode) {
        this.cmpasgempcode = cmpasgempcode;
    }

    public char getCmpsts() {
        return cmpsts;
    }

    public void setCmpsts(char cmpsts) {
        this.cmpsts = cmpsts;
    }
    
}
