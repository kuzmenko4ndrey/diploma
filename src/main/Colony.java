/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javafx.util.Pair;

/**
 *
 * @author Neophron
 */
public class Colony implements Runnable {

    public static final int ELITE_FER = 300;

    private ArrayList<Agent> a = new ArrayList<>();
    private Terrain terrain;
    private double probOfWar;
    private double probOfCh;
    private int myNum;
    private int totalNum;
    private ArrayList<Integer> bestPath = new ArrayList<>(), war = new ArrayList<>();
    private Pair<Integer, Integer> coord;

    public Colony(int x, int y, int countOfAg, double warProb, double chProb) {
//        for (int i = 0; i < countOfAg; i++) {
//            a.add(new Agent(this, i));
//        }
        probOfWar = warProb;
        probOfCh = chProb;
        coord = new Pair<>(x, y);
    }
    
    public void initA(int coa) {
        for (int i = 0; i < coa; i++) {
            a.add(new Agent(this, i));
        }
    }

    public Pair<Integer, Integer> getCoord() {
        return coord;
    }

    public int getNum() {
        return myNum;
    }

    public void setTerrain(Terrain t) {
        terrain = t;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public double getWarProb() {
        return probOfWar;
    }

    public double getChProb() {
        return probOfCh;
    }

    public int getNumOfAgent() {
        return a.size();
    }

    public void addAgent() {
        if (a.isEmpty()) {
            a.add(new Agent(this, 0));
        } else {
            a.add(new Agent(this, a.get(a.size() - 1).getNum() + 1));
        }
    }

    public void setNum(int n) {
        myNum = n;
    }

    public void setTotal(int n) {
        totalNum = n;
        for (int i = 0; i < totalNum; i++) {
            bestPath.add(0);
            war.add(0);
        } 
        for (Integer i : bestPath) {
            i = Integer.MAX_VALUE;
        }
    }

    public void delAgent(int n) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getNum() == n) {
                a.remove(i);
                return;
            }
        }
    }

    @Override
    public void run() {
        for (Agent ag : a) {
            ag.move();
        }
        //System.out.println(myNum + " day finished");
    }

    public void setWar(int c) {
        war.set(c, 1);
    }

    public boolean isWar(int c) {
        return war.get(c) == 1;
    }

    public void checkPath(ArrayList<Pair<Integer, Integer>> path, int c) {
        int s = 0;
        for (Pair<Integer, Integer> p : path) {
            s += terrain.getTer(p.getKey(), p.getValue());
        }
        if (s < bestPath.get(c)) {
            bestPath.set(c, s);
            for (Pair<Integer, Integer> p : path) {
                terrain.addFer(p.getKey(), p.getValue(), myNum, ELITE_FER);
            }
        }
    }

}
