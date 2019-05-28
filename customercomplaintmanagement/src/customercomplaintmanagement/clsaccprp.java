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
public class clsaccprp {
    private int accno;
    private String accname;
    private Date accdate=new Date();
    private String accadd;
    private String accloc;
    private String accphnno;
    private String acctype;

    public Date getAccdate() {
        return new java.sql.Date(accdate.getTime());
    }

    public void setAccdate(Date accdate) {
        this.accdate = accdate;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public String getAccadd() {
        return accadd;
    }

    public void setAccadd(String accadd) {
        this.accadd = accadd;
    }

    public String getAccloc() {
        return accloc;
    }

    public void setAccloc(String accloc) {
        this.accloc = accloc;
    }

    public String getAccphnno() {
        return accphnno;
    }

    public void setAccphnno(String accphnno) {
        this.accphnno = accphnno;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }
    
}
