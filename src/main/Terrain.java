/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Neophron
 */
public class Terrain implements Runnable {

    public static final int N = 500;
    public static final int MAX_FER = 1000;
    private boolean pause = false;
    private boolean firstrun = true;
    MainForm mf;
    Graphics g;

    private ArrayList<Colony> col = new ArrayList<>();
    private ArrayList<Thread> lt = new ArrayList<>(), lc = new ArrayList<>();
    private volatile int[][][] fer;
    private int[][] ter = new int[N][N];

    public Terrain(MainForm m) {
        mf = m;
        g = mf.getGraphics();
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                g.setColor(Color.green);
                g.drawLine(i, j, i, j);
            }
        }
    }

    public int getNumOfCol() {
        return col.size();
    }
    
    public MainForm getMF() {
        return mf;
    }

    public void pause() {
        pause = true;
    }

    public void unpause() {
        pause = false;
    }

    public Colony getColony(int c) {
        return col.get(c);
    }

    public void addColony(Colony c) {
        c.setNum(col.size());
        c.setTerrain(this);
        col.add(c);
    }

    public void setTer(int x, int y, int p) {
        ter[x][y] = p;
    }

    public int getTer(int x, int y) {
        return ter[x][y];
    }

    public synchronized void addFer(int x, int y, int c, int f) {
        fer[x][y][c] += f;
        if (fer[x][y][c] > 10000) {
            fer[x][y][c] = 10000;
        }
        if (fer[x][y][c] < 10) {
            fer[x][y][c] = 10;
        }
    }

    public int getFer(int x, int y, int c) {
        return fer[x][y][c];
    }

    @Override
    public void run() {
        if (firstrun) {
            fer = new int[N][N][col.size()];
            for (Colony c : col) {
                c.setTotal(col.size());
            }
        }
        while (!pause) {
            lt.clear();
            for (Colony c : col) {
                Thread t = new Thread(c);
                lt.add(t);
                t.start();
            }
            for (Thread t : lt) {
                try {
                    t.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Terrain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            lc.clear();
            for (int i = 0; i < 7; i++) {
                lc.add(new Thread(new Cleaner(this, i * (N / 8), (i + 1) * (N / 8))));
            }
            lc.add(new Thread(new Cleaner(this, 7 * (N / 8), N)));
            for (Thread t : lc) {
                t.start();
            }
            for (Thread t : lc) {
                try {
                    t.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Terrain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
