/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author user
 */
public class IteratorThread implements Runnable {
    
    //ArrayList<String> arrayList;
    Iterator iterator;
    String threadName;
    
    public IteratorThread(Iterator iterator, String threadName) {
        //this.arrayList = arrayList;
        this.iterator = iterator;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (iterator.hasNext()) 
            System.out.print(iterator.next() + " " + this.threadName + "\n"); 
  
        System.out.println(); 
    }
    
}
