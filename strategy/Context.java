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
public class Context {
    private ListConverter strategy;
    private List<String> list;
    
    public Context(ListConverter strategy){
        this.strategy = strategy;
        this.list = new ArrayList<String>();
        list.add("Hei");
        list.add("muailma");
        list.add("mitäs");
        list.add("kuuluu?");
        list.add("tässä");
        list.add("vähän");
        list.add("lisää");
        list.add("sanoja");
    }
    
    public void printList() {
        System.out.println(strategy.listToString(list));
    }
}
