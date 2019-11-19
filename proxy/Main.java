/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Main {
    /**
    * Test method
    */
   public static void main(final String[] arguments) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        /*
        // wikipedian alkup.
        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
        */
        
        ArrayList<Image> imageArrayList = new ArrayList();
        imageArrayList.add(image1);
        imageArrayList.add(image2);
        
        // tulosta(ilman lataamista) kansion sisältö
        for (Image image : imageArrayList) {
            image.showData();
        }
        
        // selaa (ja lataa) kansion kuvat
        for (Image image : imageArrayList) {
            image.showData();
            image.displayImage();
        }
    }
}
