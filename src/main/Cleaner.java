/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Neophron
 */
public class Cleaner implements Runnable{
    
    Terrain t;
    int from, to;
    
    public Cleaner(Terrain t, int from, int to) {
        this.t = t;
        this.from = from;
        this.to = to;
    }
    
    @Override
    public void run() {
        for(int i = from; i < to; i++) {
            for (int j = 0; j < t.N; j++) {
                int s = 0;
                for (int c = 0; c < t.getNumOfCol(); c++) {
                    t.addFer(i, j, c, -1);
                    s += t.getFer(i, j, c);
                }
                if (s > 3000) {
                    t.getMF().draw(i, j, -1, 1);
                } else {
                    t.getMF().draw(i, j, t.getTer(i, j), 1);
                }
            }
        }
    }
    
}
