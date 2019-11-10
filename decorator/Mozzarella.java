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
public class Mozzarella extends PizzaDecorator {
    private float price = 2f;

    public Mozzarella(Pizza pizzaToBeDecorated) {
        super(pizzaToBeDecorated);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mozzarella";
    }

    @Override
    public float getPrice() {
        return super.getPrice() + price;
    }
    
}
