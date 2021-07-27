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
public class ARTWORK {
    private int idArtist;
    private int idCustomer = 0;
    private int id;
    private String title;
    private String typeOfArt;
    private int price ;
    private String path;
    private int year;
    
    public ARTWORK()
    {
        this.id = 0;
        this.idArtist = 0 ;
        this.idCustomer = 0;
        this.price = 0;
        this.title = "ERROR";
        this.year = 0;
        this.typeOfArt = "ERROR";
        this.path = "ERROR";
    }
    
    public ARTWORK(int id1,String title1,int idArtist1,int idcustomer1,String typeOfArt1,int price1,int year1,String path1)
    {
        this.id = id1;
        this.idArtist = idArtist1;
        this.title = title1;
        this.typeOfArt = typeOfArt1;
        this.price = price1;
        this.idCustomer = idcustomer1;
        this.year = year1;
        this.path = path1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIdArtist(int idArtist) {
        this.idArtist = idArtist;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTypeOfArt(String typeOfArt) {
        this.typeOfArt = typeOfArt;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIdArtist() {
        return idArtist;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTypeOfArt() {
        return typeOfArt;
    }

    public int getPrice() {
        return price;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    
    
}
