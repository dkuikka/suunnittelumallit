/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author user
 */

public class Osallistuja extends Thread implements Runnable {
    private Object object;
    private Arvuuttaja arvuuttaja;
    boolean win = false;
    
    public Osallistuja (Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
    }
    
    public void liityPeliin() {
        this.object = arvuuttaja.liityPeliin();
        System.out.println("osallistuja vastaanotti arvan " + object);
    }
    
    public boolean arvaaLuku() {
        double randomDouble = Math.random();
	randomDouble = randomDouble * 50 + 1;
	int randomInt = (int) randomDouble;
        
        System.out.println("Osallistuja aikoo osallistua luvulla " + randomInt);
        return arvuuttaja.arvaaLuku(randomInt, object);
    }
    
    public void run() {
        liityPeliin();
        while(!win){
            System.out.println("Uusi arvaus arvuuttajalle!");
            win = arvaaLuku(); 
        } 
        System.out.println("We have a winner!");
    }
    
}
