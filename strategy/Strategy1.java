/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Strategy1 implements ListConverter {

    @Override
    public String listToString(List list) {
        String listAsString = "";
        String[] stringsArray = new String[list.size()];
        stringsArray = (String[])list.toArray(stringsArray);
        
        int i = 1;
        for (String string : stringsArray) {
            listAsString += string;
            if (i%3 == 0) {
                listAsString += "\n";
            }
            i++;
        }
        
        return listAsString;
    }
    
}
