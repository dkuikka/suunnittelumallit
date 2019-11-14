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
public abstract class Handler {
    private Handler successor;
    
    public Handler(Handler successor) {
        this.successor = successor;
    }
    
    public void handle(float req) {
        if (successor != null) {
            successor.handle(req);
        } else {
            System.out.println("Pitää keskustella hallituksen kanssa.");
        }
    }
    
}
