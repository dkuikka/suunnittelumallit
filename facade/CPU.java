/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author user
 */
public class CPU {
    public void freeze() { 
        System.out.println("Freezing pc");
    }
    public void jump() { 
        System.out.println("Jumping position");
    }
    public void execute() { 
        System.out.println("Executing command");
    }
}
