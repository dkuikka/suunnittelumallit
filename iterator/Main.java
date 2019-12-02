/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        for (int i=0; i<10; i++) {
            arrayList.add("string" + i);
        }
        
        Iterator iterator = arrayList.iterator(); 
        
        IteratorThread thread1 = new IteratorThread(iterator, "thread1");
        IteratorThread thread2 = new IteratorThread(iterator, "thread2");
        
        // käynnistetään kaksi säiettä samalla iteraattorilla
        //new Thread(thread1).start();
        //new Thread(thread2).start();
        // lopputulos on arvaamaton. saattaa sisältää tuplia ja epäjärjestystä
        
        // Testataan käytöstä, kun kokoelmaan tehdään muutoksia iteroinnin aikana
        /*
        for (int i=11; i<20; i++) {
            arrayList.add("string" + i);
        }
        */
        //lopputulos on että ohjelma kaatuu "java.util.ConcurrentModificationException"

        // luodaan synkronoitu lista vuorottaista iterointia varten
        List<String> list = Collections.synchronizedList(new ArrayList<String>()); 
        for (int i=0; i<10; i++) {
            list.add("string" + i);
        }
        
        // luodaan myös uudet säikeet uudelle listalle
        IteratorThread thread3 = new IteratorThread(iterator, "thread3");
        IteratorThread thread4 = new IteratorThread(iterator, "thread4");
        
        new Thread(thread3).start();
        new Thread(thread4).start();
        // lopputulos on sama tilanne kuin normaalisti iteroitaessa, eli saattaa tuottaa tuplia ja epäjärjestystä
        // herää kysymys onko lista todella säieturvallinen -ei taida olla
        
        
    }
}
