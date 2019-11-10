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
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Tervetuloa Pizza Metropoliaan!");
        System.out.println("");
        System.out.println("Päivän menu:");
        
        // Luodaan uusi Mozzarellapizza
        Pizza mozzarellaPizza = new Mozzarella(new Tomaattisose(new PizzaPohja()));
        System.out.println("Mozzarellapizza: " + mozzarellaPizza.getDescription() + ", hinta: " + mozzarellaPizza.getPrice() + "€");
        
        // Luodaan Pepperonipizza
        Pizza pepperoniPizza = new Pepperoni(new Mozzarella(new Tomaattisose(new PizzaPohja())));
        System.out.println("Pepperonipizza: " + pepperoniPizza.getDescription() + ", hinta: " + pepperoniPizza.getPrice() + "€");
        
        // Luodaan Pizza Francescana
        Pizza pizzaFrancescana = new Kinkku(new Mozzarella(new Tomaattisose(new PizzaPohja())));
        System.out.println("Pizza Francescana: " + pizzaFrancescana.getDescription() + ", hinta: " + pizzaFrancescana.getPrice() + "€");
    }
}
