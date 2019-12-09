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
public class FlipDownCommand implements Command {
    private Valkokangas light;
    
    public FlipDownCommand(Valkokangas light) {
        this.light = light;
    }

    @Override// Command
    public void execute() {
        light.turnOff();
    }
}
