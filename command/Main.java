/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        Valkokangas lamp = new Valkokangas();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);
        WallButton button1 = new WallButton(switchUp);
        WallButton button2 = new WallButton(switchDown);
        button1.push();
        button2.push();
    }
}
