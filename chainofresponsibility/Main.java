/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Esimies esimies = new Esimies(new Paalikko(new Toimitusjohtaja(null)));
        
        esimies.handle(0.01f);
        esimies.handle(0.025f);
        esimies.handle(0.05f);
        esimies.handle(0.11f);
    }
}
