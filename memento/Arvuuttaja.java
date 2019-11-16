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
public class Arvuuttaja {
    
    public int arvoLuku() {
        double randomDouble = Math.random();
	randomDouble = randomDouble * 50 + 1;
	int randomInt = (int) randomDouble;
        System.out.println("Arvuuttaja arpoi luvun " + randomInt);
        return randomInt;
    }
    
    public Object liityPeliin() {
        System.out.println("Uusi osallistuja liittyi peliin.");
        return new Memento(arvoLuku());
    }
    
    public boolean arvaaLuku(int arvaus, Object arpa) {
        System.out.println("Arvuuttaja tarkastaa arvan...");
        Memento mArpa = (Memento) arpa;
        if (mArpa.getArpaLuku() == arvaus) {
            System.out.println("Voittoarpa!");
            return true;
        } else {
            System.out.println("Ei voittoa!");
            return false;
        }
    }
    
    private class Memento {
        int arpaLuku;
        
        public Memento(int arvottuLuku){
            arpaLuku = arvottuLuku;
        }
        
        public int getArpaLuku() {
            return arpaLuku;
        }
    }
    
}
