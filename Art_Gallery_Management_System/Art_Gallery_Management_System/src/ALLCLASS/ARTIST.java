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
public class ARTIST extends PEARSON{
    private String nationality;
    private String []styleOfArts;
    private int totalMoney = 0;
    private int nOfStyleOfArts;
    private int age;
    public ARTIST()
    {
      super("ERROR",0,"ERROR","123456");
      this.nationality = "ERROR";
      this.styleOfArts = new String[10];
      this.totalMoney = 0;
      this.age = 0;
    }
    
    public ARTIST(int id1,String name1,String password1,int age1,int nofstyleofarts,String []styleOfArts1,String nationality1)
    {
    super("ARTIST",id1,name1,password1);
    this.nationality = nationality1;
    this.styleOfArts = styleOfArts1;
    this.nOfStyleOfArts =  nofstyleofarts;
    this.age = age1;
    }
    public String getNationality() {
        return nationality;
    }
   public String[] getStyleOfArts() {
        return styleOfArts;
    }

    public int getTotalMoney() {
        return totalMoney;
    }
    
    public int getnOfStyleOfArts() {
        return nOfStyleOfArts;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setStyleOfArts(String[] styleOfArts) {
        this.styleOfArts = styleOfArts;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void setnOfStyleOfArts(int nOfStyleOfArts) {
        this.nOfStyleOfArts = nOfStyleOfArts;
    }
    
    
    //////////////////////////////
    public PEARSON get_data()
    {
        ARTIST artist = new ARTIST();
    
         artist.setId(this.id);
         artist.setName(this.name);
         artist.setAge(this.age);
         artist.setNationality(this.nationality);
         artist.setStyleOfArts(this.styleOfArts);
         artist.setTotalMoney(this.totalMoney);
         artist.setnOfStyleOfArts(this.nOfStyleOfArts);
         return artist;        
    }

    
}
