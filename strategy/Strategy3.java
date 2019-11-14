/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;

/**
 *
 * @author user
 */
public class Strategy3 implements ListConverter {

    @Override
    public String listToString(List list) {
        String listAsString = "";
        
        for (int i = 0; i < list.size(); i++) {
            listAsString += list.get(i);
            listAsString += "\n";
        }
        
        return listAsString;
    }
    
}
