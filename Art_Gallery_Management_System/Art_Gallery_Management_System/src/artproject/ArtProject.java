/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artproject;
import ALLCLASS.*;
import ALLGUI.LOGINFORM;
/**
 *
 * @author Amir Mahmoud
 */
public class ArtProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     ReadWriteDataFromFiles.readDataFromPearsons();
     ReadWriteDataFromFiles.readDataFromArtWork();
     new LOGINFORM().setVisible(true);
    }
    
}
