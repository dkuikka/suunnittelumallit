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
public class Raichu implements PokemonState {

    @Override
    public void attack() {
        System.out.println("Raichu superhyökkäys!");
    }

    @Override
    public void defend() {
        System.out.println("Raichu superpuolustus!");
    }

    @Override
    public void talk() {
        System.out.println("Olen Raichu!");
    }

    @Override
    public PokemonState getInstance() {
        return this;
    }
    
}
