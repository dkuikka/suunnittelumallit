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
public class Kello implements Cloneable {
    Viisari hViisari;
    Viisari mViisari;
    Viisari sViisari;
    
    public Kello() {
        this.hViisari = new Viisari();
        this.mViisari = new Viisari();
        this.sViisari = new Viisari();
    }
    
    public Kello(int hTime, int mTime, int sTime) {
        this.hViisari = new Viisari(hTime);
        this.mViisari = new Viisari(mTime);
        this.sViisari = new Viisari(sTime);
    }
    
    public void tick() {
        if (sViisari.getTime() < 59) {
            sViisari.tick();
        } else if (mViisari.getTime() < 59) {
            sViisari.tick();
            mViisari.tick();
        } else if (hViisari.getTime() < 23) {
            sViisari.tick();
            mViisari.tick();
            hViisari.tick();
        }
        System.out.println("Kello on: " + hViisari.getTime() + " : " + mViisari.getTime() + " : " +  sViisari.getTime());
    }
    
    public Object clone()throws CloneNotSupportedException{  
        Kello kello = null;
        kello = (Kello)super.clone();
        kello.hViisari = new Viisari();
        kello.mViisari = new Viisari();
        kello.sViisari = new Viisari();
        return kello;  
    }  
    
}
