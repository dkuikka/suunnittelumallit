/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class Strategy2 implements ListConverter {
    
    

    @Override
    public String listToString(List list) {
        Iterator iterator = list.iterator();
        String listAsString = "";
        
        int i = 1;
        while (iterator.hasNext()) {
            listAsString += iterator.next();
            if(i%2 == 0){
                listAsString += "\n";
            }
            i++;
        }
        
        return listAsString;
    }
    
} 
   
