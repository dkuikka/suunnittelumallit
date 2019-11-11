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
public class Pikachu implements PokemonState {

    @Override
    public void attack() {
        System.out.println("Pikachu perushyökkäys!");
    }

    @Override
    public void defend() {
        System.out.println("Pikachu peruspuolustus!");
    }

    @Override
    public void talk() {
        System.out.println("Olen Pikachu!");
    }

    @Override
    public PokemonState getInstance() {
        return this;
    }
    
}
