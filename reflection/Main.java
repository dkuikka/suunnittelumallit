/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection;

import java.lang.*;
import java.util.Properties;
import java.io.*;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Class c = null;
        IAbstractFactory factory = null;
        
        Properties properties = new Properties();
        try {
            properties.load(
            new FileInputStream("properties"));
        } catch (IOException e) {e.printStackTrace();}
        try{
        //luetaan toteuttava tehdas properties-tiedostosta
            c = Class.forName(properties.getProperty("factory"));
            factory = (IAbstractFactory)c.newInstance();
        }catch (Exception e){e.printStackTrace();}
        
        
        Jasper jasper = new Jasper(factory);
        jasper.esitteleVaatteet();   
    }
}
