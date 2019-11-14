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
public class Esimies extends Handler {
    private float auth = 0.02f;
    
    public Esimies(Handler successor) {
        super(successor);
    }
    
    public void handle(float req) {
        if (req <= auth) {
            System.out.println("Esimies käsittelee pyynnön");
        } else {
            super.handle(req);
        }
    }
    
}
