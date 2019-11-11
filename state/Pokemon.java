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
public class Pokemon {
    private PokemonState state = null;
    
    public Pokemon(PokemonState state) {
        this.state = state;
    }
    
    public void attack() {
        state.attack();
    }
    
    public void defend() {
        state.defend();
    }
    
    public void talk() {
        state.talk();
    }
    
    protected void changeState(PokemonState state) {
        this.state = state;
    }
    
}
