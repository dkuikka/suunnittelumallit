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
public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Osallistuja osallistuja1 = new Osallistuja(arvuuttaja);
        Osallistuja osallistuja2 = new Osallistuja(arvuuttaja);
        osallistuja1.start();
        osallistuja2.start();
    }
}
