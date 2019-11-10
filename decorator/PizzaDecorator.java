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
public abstract class PizzaDecorator implements Pizza{
    protected Pizza pizzaToBeDecorated;
    protected float price;
    
    public PizzaDecorator(Pizza pizzaToBeDecorated) {
        this.pizzaToBeDecorated = pizzaToBeDecorated;
    }
    
    public float getPrice() {
        return pizzaToBeDecorated.getPrice();
    }
    
    public String getDescription() {
        return pizzaToBeDecorated.getDescription();
    }
    
}
