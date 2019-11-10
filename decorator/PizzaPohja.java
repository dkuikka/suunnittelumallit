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
public class PizzaPohja implements Pizza {
    private float price = 2f;

    @Override
    public String getDescription() {
        return "Pizzapohja";
    }

    @Override
    public float getPrice() {
        return price;
    }
    
}
