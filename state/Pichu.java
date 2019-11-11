/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author user
 */
public class Pichu implements PokemonState {

    @Override
    public void attack() {
        System.out.println("Pichu heikko lyönti!");
    }

    @Override
    public void defend() {
        System.out.println("pichu heikko puolustus");
    }

    @Override
    public void talk() {
        System.out.println("Olen Pichu!");
    }

    @Override
    public PokemonState getInstance() {
        return this;
    }
    
}
