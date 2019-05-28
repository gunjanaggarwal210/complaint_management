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
public class clsvstprp {
     private int vstcode;
     private Date vstdate=new Date();
     private int vstcmpcode;
     private String vstdsc;
     private int vstfeed;

    public Date getVstdate() {
        return new java.sql.Date(vstdate.getTime());
    }

    public void setVstdate(Date vstdate) {
        this.vstdate = vstdate;
    }

    public int getVstcode() {
        return vstcode;
    }

    public void setVstcode(int vstcode) {
        this.vstcode = vstcode;
    }

    public int getVstcmpcode() {
        return vstcmpcode;
    }

    public void setVstcmpcode(int vstcmpcode) {
        this.vstcmpcode = vstcmpcode;
    }

    public String getVstdsc() {
        return vstdsc;
    }

    public void setVstdsc(String vstdsc) {
        this.vstdsc = vstdsc;
    }

    public int getVstfeed() {
        return vstfeed;
    }

    public void setVstfeed(int vstfeed) {
        this.vstfeed = vstfeed;
    }
     
}
