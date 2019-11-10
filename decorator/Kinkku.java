/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author user
 */
public class Kinkku extends PizzaDecorator {
    private float price = 2;
    
    public Kinkku(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", kinkku";
    }

    @Override
    public float getPrice() {
        return super.getPrice() + price;
    }
    
}
