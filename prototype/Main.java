/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Kello kello1 = new Kello();
        Kello kello2;
        try {
            kello2 = (Kello)kello1.clone();
        } 
        catch(CloneNotSupportedException c){ 
            kello2 = null; 
            System.out.println("kello2 null");
        }  
        
        int i = 0;
        while (i < 60) {
            kello1.tick();
            kello2.tick();
            i++;
        }
    }
    
}
