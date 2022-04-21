
package com.sig.model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    private int num;
    private String customer;
    private Date invdate;
    private ArrayList<InvoiceLine> lines;

    public InvoiceHeader() {
    }

    public InvoiceHeader(int num, String customer, Date invdate) {
        this.num = num;
        this.customer = customer;
        this.invdate = invdate;
    }

    public Date getInvdate() {
        return invdate;
    }

    public void setInvdate(Date invdate) {
        this.invdate = invdate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
    public double getInvoiceTotal(){
       double total = 0.0;
       
       for (int i = 0; i < lines.size(); i++){
           total += lines.get(i).getLineTotal();
       }
       
       return total;
    }
}
