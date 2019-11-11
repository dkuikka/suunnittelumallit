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
public interface PokemonState {
    public void attack();
    public void defend();
    public void talk();
    public PokemonState getInstance();
}
