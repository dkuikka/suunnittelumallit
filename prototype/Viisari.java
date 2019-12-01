/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author user
 */
public class Viisari {
    int point;
    
    public Viisari() {
        point = 0;
    }
    
    public Viisari(int time) {
        point = time;
    }
    
    public void tick() {
        if (point < 59) {
            point++;
        } else {
            point = 0;
        }
    }
    
    public int getTime() {
        return point;
    }
    
}
