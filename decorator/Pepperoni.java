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
public class Pepperoni extends PizzaDecorator {
    private float price = 3f;

    public Pepperoni(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pepperoni";
    }

    @Override
    public float getPrice() {
        return super.getPrice() + price;
    }
    
}
