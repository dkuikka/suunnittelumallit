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
public class Main {
    public static void main(String[] args) {
        PokemonState pichu = new Pichu();
        PokemonState pikachu = new Pikachu();
        PokemonState raichu = new Raichu();
        
        Pokemon poke = new Pokemon(pichu);
        poke.attack();
        poke.changeState(pikachu);
        poke.attack();
        poke.changeState(raichu);
        poke.attack();
    }
}
