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
public class Tomaattisose extends PizzaDecorator {
    private float price = 2f;
    
    public Tomaattisose(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", tomaattisose";
    }

    @Override
    public float getPrice() {
        return super.getPrice() + price;
    }
    
}
