/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author user
 */
public class Adapter implements ITarget {
    Adaptee adaptee;
    
    public Adapter(Adaptee a) {
        this.adaptee = a;
    }
    
    public void tervehdi() {
        this.adaptee.tervehdiEspanjaksi();
    }
}
