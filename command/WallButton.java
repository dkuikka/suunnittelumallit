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
public class WallButton {
    Command command;
    public WallButton(Command cmd){
        command = cmd;
    }
    
    public void push() {
        command.execute();
    }
}
