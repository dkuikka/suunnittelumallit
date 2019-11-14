/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;
import java.util.List;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Context strat1 = new Context(new Strategy1());
        Context strat2 = new Context(new Strategy2());
        Context strat3 = new Context(new Strategy3());
        
        // list to array, new line every 3rd
        strat1.printList();
        
        // using iterator, new line every 2nd
        strat2.printList();
        
        // using get(), new line always
        strat3.printList();
    }
}
