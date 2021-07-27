/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALLCLASS;

/**
 *
 * @author A7med_Sa3d
 */
public class CUSTOMER extends PEARSON{
    private String address;
    private int totalMoney;
     public CUSTOMER()
    {
      super("ERROR",0,"ERROR","123456");
      this.address = "ERROR";
      this.totalMoney = 0;   
    }
    public CUSTOMER(int id1,String name1,String password1,String address1)
    {
        super("CUSTOMER",id1,name1,password1);
        this.address = address1;
        
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getAddress() {
        return address;
    }

    public int getTotalMoney() {
        return totalMoney;
    }
    
    public PEARSON get_data()
    {
        CUSTOMER customer = new CUSTOMER();
        
        customer.setId(this.id);
        customer.setName(this.name);
        customer.setPassword(this.password);
        customer.setAddress(this.address);
        return customer;
    }
    
}

