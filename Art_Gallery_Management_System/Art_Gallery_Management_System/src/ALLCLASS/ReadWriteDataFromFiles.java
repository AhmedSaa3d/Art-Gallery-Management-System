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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.MethodHandles;
import java.util.Scanner;
/**
 *
 * @author A7med_Sa3d
 */
public class ReadWriteDataFromFiles {
   
    
    ////////////////////////
    public static PEARSON pearsons[] = new PEARSON[100];
    public static int pearsonssize = 0;
    public static ARTWORK artwork[] = new ARTWORK[100];
    public static int artworksize = 0;
    public static int customersize = 0;
    public static int artistssize = 0;
    
    public static void addNewartwork(ARTWORK newartwork)
    {
      artwork[artworksize] = newartwork;   
      artworksize++;
      WriteDataIntoArtWork();
    }

    public static void add_artist(ARTIST artist)
    {
       pearsons[pearsonssize] = new ARTIST();
       pearsons[pearsonssize] = artist;
       pearsonssize++;
       artistssize++;
       WriteDataIntoPearsons();
    }
    public static void add_customer(CUSTOMER customer)
    {
       pearsons[pearsonssize] = new CUSTOMER();
       pearsons[pearsonssize] = customer;
       pearsonssize++;
       customersize++;
       WriteDataIntoPearsons();
    }
    
    //pearsons read data
     public static void readDataFromPearsons()
     {
         try
            {
            File file = new File("artists_customers_data.txt");
            Scanner read = new Scanner(file);
            while(read.hasNext())
                {
                    String data = read.nextLine();
                    String arr[] = data.split("-");
                    if(arr[0].equals("ARTIST"))
                    {
                        artistssize++;
                        int id = Integer.parseInt(arr[1]);
                        String name = arr[2];
                        String password = arr[3];
                        int age = Integer.parseInt(arr[4]);
                        int nOfStyleOfArts =Integer.parseInt(arr[5]);
                        String []styleofArts = new String[10];
                        for(int i=0;i<nOfStyleOfArts;i++)
                        {
                            styleofArts[i] = arr[6+i];
                        }
                        String nationality = (arr[(arr.length)- 1]);
                      pearsons[pearsonssize] = new ARTIST(id,name,password,age,nOfStyleOfArts,styleofArts,nationality);
                      pearsonssize++;
                    }
                    else if(arr[0].equals("CUSTOMER"))
                    {
                        customersize++;
                        int id = Integer.parseInt(arr[1]);
                        String name = arr[2];
                        String password = arr[3];
                        String address = arr[4];
                      pearsons[pearsonssize] = new CUSTOMER(id,name,password,address);
                     pearsonssize++;
                    }
                }
            }
            catch(FileNotFoundException EX)
              {
                  System.out.printf("Error File Not Found To Read Data From It. %d",EX);
              }
     }
    
     //pearsons write data
     public static void WriteDataIntoPearsons()
    {
        try
        {
            File file = new File("artists_customers_data.txt");
            PrintWriter write = new PrintWriter(file);
            
            for(int i=0 ; i<pearsonssize ; i++)
            {
                if(pearsons[i] instanceof CUSTOMER )
                {
                    CUSTOMER customer = new CUSTOMER();
                    customer = (CUSTOMER) pearsons[i].get_data();
                    write.print("CUSTOMER-");
                    write.print(customer.getId() + "-");
                    write.print(customer.getName() + "-");
                    write.print(customer.getPassword() + "-");
                    write.println(customer.getAddress());
                }
                else if(pearsons[i] instanceof ARTIST)
                {
                    ARTIST artist = new ARTIST();
                    artist = (ARTIST) pearsons[i].get_data();
                    write.print("ARTIST-");
                    write.print(artist.getId() + "-");
                    write.print(artist.getName() + "-");
                    write.print(artist.getPassword() + "-");
                    write.print(artist.getAge()+ "-");
                    write.print(artist.getnOfStyleOfArts() + "-");
                    String arr[] = new String[10];
                    arr = artist.getStyleOfArts();
                    for(int j=0;j<artist.getnOfStyleOfArts();j++)
                        write.print(arr[j] + "-");
                    write.println(artist.getNationality());
               
                }
                
            }
            write.close();
        }
        catch(IOException ex)
        {
            System.out.printf("Error File Not Found To Write Data into It. %d",ex);
        }
    }
    
     //ArtWork Read write Data
     public static void readDataFromArtWork()
    {
     try
            {
            File file = new File("ArtWork_Data.txt");
            Scanner read = new Scanner(file);
            while(read.hasNext())
                {
                    String data = read.nextLine();
                    String arr[] = data.split("-");
                    int id = Integer.parseInt(arr[0]);
                    String name = arr[1];
                    int id2 = Integer.parseInt(arr[2]);
                    int id3 = Integer.parseInt(arr[3]);
                    String typeofart = arr[4];
                    int totalmoney = Integer.parseInt(arr[5]);
                    int year = Integer.parseInt(arr[6]);
                    String path = arr[7];
               artwork[artworksize] = new ARTWORK(id,name,id2,id3,typeofart,totalmoney,year,path);
               artworksize++;
                }
            }
            catch(FileNotFoundException ex)
              {
               System.out.printf("Error File Not Found To Read Data From It. %d",ex);
              }
    }
     public static void WriteDataIntoArtWork()
    {
        try
        {
            File file = new File("ArtWork_Data.txt");
            PrintWriter write = new PrintWriter(file);
            for(int i=0;i<artworksize;i++)
            {
                write.print(artwork[i].getId() + "-");
                write.print(artwork[i].getTitle()+ "-");
                write.print(artwork[i].getIdArtist() + "-");
                write.print(artwork[i].getIdCustomer() + "-");
                write.print(artwork[i].getTypeOfArt() + "-");
                write.print(artwork[i].getPrice() + "-");
                write.print(artwork[i].getYear()+ "-");
                write.println(artwork[i].getPath());
            }
            write.close();
        }
        catch(IOException ex)
        {
         System.out.printf("Error File Not Found To Write Data into It. %d",ex);
        }
    }
    
}
