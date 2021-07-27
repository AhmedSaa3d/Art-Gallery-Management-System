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
public abstract class PEARSON {
    protected String type;
    protected int id;
    protected String name;
    protected String password;
    
    public PEARSON(String type1,int id1,String name1,String password1)
    {
        this.type = type1;
        this.id = id1;
        this.name = name1;
        this.password = password1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    
    public abstract PEARSON get_data();
    
    
}
