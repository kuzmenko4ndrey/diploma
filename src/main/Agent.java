/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Random;
import javafx.util.Pair;

/**
 *
 * @author Neophron
 */
public class Agent {

    public static final int DAILY_MOVE_POINT = 12;
    public static final int FER_PER_MOVE = 5;
    public static final double ALPHA = 3, BETA = 1;

    private Colony c;
    private int num;
    private ArrayList<Pair<Integer, Integer>> blockList = new ArrayList<>();
    private Pair<Integer, Integer> coord;
    private int mp = 0;

    public Agent(Colony _c, int n) {
        c = _c;
        num = n;
        coord = new Pair<>(c.getCoord().getKey(), c.getCoord().getValue());
    }

    //701
    //6#2
    //543
    public void move() {
        mp += DAILY_MOVE_POINT;
        while (mp > 0) {
            double[] pr = new double[8];
            int x = coord.getKey(), y = coord.getValue();
            if (y > 0) {
                for (int i = 0; i < c.getTerrain().getNumOfCol(); i++) {
                    if (c.isWar(i)) {
                        pr[0] -= Math.pow(c.getTerrain().getFer(x, y - 1, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x, y - 1), BETA);
                    } else {
                        pr[0] += Math.pow(c.getTerrain().getFer(x, y - 1, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x, y - 1), BETA);
                    }
                }
            }
            if (y > 0 && x < Terrain.N - 1) {
                for (int i = 0; i < c.getTerrain().getNumOfCol(); i++) {
                    if (c.isWar(i)) {
                        pr[1] -= Math.pow(c.getTerrain().getFer(x + 1, y - 1, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x + 1, y - 1), BETA);
                    } else {
                        pr[1] += Math.pow(c.getTerrain().getFer(x + 1, y - 1, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x + 1, y - 1), BETA);
                    }
                }
            }
            if (x < Terrain.N - 1) {
                for (int i = 0; i < c.getTerrain().getNumOfCol(); i++) {
                    if (c.isWar(i)) {
                        pr[2] -= Math.pow(c.getTerrain().getFer(x + 1, y, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x + 1, y), BETA);
                    } else {
                        pr[2] += Math.pow(c.getTerrain().getFer(x + 1, y, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x + 1, y), BETA);
                    }
                }
            }
            if (x < Terrain.N - 1 && y < Terrain.N - 1) {
                for (int i = 0; i < c.getTerrain().getNumOfCol(); i++) {
                    if (c.isWar(i)) {
                        pr[3] -= Math.pow(c.getTerrain().getFer(x + 1, y + 1, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x + 1, y + 1), BETA);
                    } else {
                        pr[3] += Math.pow(c.getTerrain().getFer(x + 1, y + 1, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x + 1, y + 1), BETA);
                    }
                }
            }
            if (y < Terrain.N - 1) {
                for (int i = 0; i < c.getTerrain().getNumOfCol(); i++) {
                    if (c.isWar(i)) {
                        pr[4] -= Math.pow(c.getTerrain().getFer(x, y + 1, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x, y + 1), BETA);
                    } else {
                        pr[4] += Math.pow(c.getTerrain().getFer(x, y + 1, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x, y + 1), BETA);
                    }
                }
            }
            if (y < Terrain.N - 1 && x > 0) {
                for (int i = 0; i < c.getTerrain().getNumOfCol(); i++) {
                    if (c.isWar(i)) {
                        pr[5] -= Math.pow(c.getTerrain().getFer(x - 1, y + 1, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x - 1, y + 1), BETA);
                    } else {
                        pr[5] += Math.pow(c.getTerrain().getFer(x - 1, y + 1, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x - 1, y + 1), BETA);
                    }
                }
            }
            if (x > 0) {
                for (int i = 0; i < c.getTerrain().getNumOfCol(); i++) {
                    if (c.isWar(i)) {
                        pr[6] -= Math.pow(c.getTerrain().getFer(x - 1, y, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x - 1, y), BETA);
                    } else {
                        pr[6] += Math.pow(c.getTerrain().getFer(x - 1, y, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x - 1, y), BETA);
                    }
                }
            }
            if (x > 0 && y > 0) {
                for (int i = 0; i < c.getTerrain().getNumOfCol(); i++) {
                    if (c.isWar(i)) {
                        pr[7] -= Math.pow(c.getTerrain().getFer(x - 1, y - 1, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x - 1, y - 1), BETA);
                    } else {
                        pr[7] += Math.pow(c.getTerrain().getFer(x - 1, y - 1, i), ALPHA)
                                + Math.pow(1.0 / c.getTerrain().getTer(x - 1, y - 1), BETA);
                    }
                }
            }
            double prob = 0;
            for (int i = 0; i < 8; i++) {
                if (pr[i] < 0) {
                    pr[i] = 0;
                }
                for (int j = 0; j < blockList.size(); j++) {
                    if (blockList.get(j).equals(toPair(coord, i))) {
                        pr[i] = 0;
                        break;
                    }
                }
                prob += pr[i];
            }
            if (prob == 0) {
                goHome();
                return;
            }
            for (int i = 0; i < 8; i++) {
                pr[i] /= prob;
            }
            for (int i = 1; i < 8; i++) {
                pr[i] += pr[i - 1];
            }
            Random r = new Random();
            double rd = r.nextDouble();
            for (int i = 0; i < 8; i++) {
                if (rd < pr[i]) {
                    moveTo(i);
                    return;
                }
            }
        }
    }
    
    public int getNum() {
        return num;
    }

    private Pair<Integer, Integer> toPair(Pair<Integer, Integer> p, int i) {
        Pair<Integer, Integer> r = null;
        switch (i) {
            case 0:
                r = new Pair<>(p.getKey(), p.getValue() - 1);
                break;
            case 1:
                r = new Pair<>(p.getKey() + 1, p.getValue() - 1);
                break;
            case 2:
                r = new Pair<>(p.getKey() + 1, p.getValue());
                break;
            case 3:
                r = new Pair<>(p.getKey() + 1, p.getValue() + 1);
                break;
            case 4:
                r = new Pair<>(p.getKey(), p.getValue() + 1);
                break;
            case 5:
                r = new Pair<>(p.getKey() - 1, p.getValue() + 1);
                break;
            case 6:
                r = new Pair<>(p.getKey() - 1, p.getValue());
                break;
            case 7:
                r = new Pair<>(p.getKey() - 1, p.getValue() - 1);
                break;
        }
        return r;
    }

    private void goHome() {
        blockList.clear();
        coord = new Pair<>(c.getCoord().getKey(), c.getCoord().getValue());
        blockList.add(coord);
        mp = 0;
    }

    private void moveTo(int to) {
        Pair<Integer, Integer> p = toPair(coord, to);
        mp -= c.getTerrain().getTer(p.getKey(), p.getValue());
        blockList.add(p);
        coord = p;
        for (int i = 0; i < c.getTerrain().getNumOfCol(); i++) {
            if (i == c.getNum()) {
                continue;
            }
            if (coord.equals(c.getTerrain().getColony(i).getCoord())) {
                //c.getTerrain().getMF().addText(c.getNum() + " reach " + i);
                c.checkPath(blockList, i);
                if (!c.isWar(i)) {
                    double cp = c.getTerrain().getColony(i).getChProb() + c.getChProb();
                    double wp = c.getTerrain().getColony(i).getWarProb() + c.getWarProb();
                    Random r = new Random();
                    if (r.nextDouble() < cp) {
                        c.delAgent(num);
                        c.getTerrain().getColony(i).addAgent();
                        c.getTerrain().getMF().addText(c.getNum() + " go to " + i);
                        //todo log
                    } else if (r.nextDouble() < wp) {
                        c.setWar(i);
                        c.getTerrain().getColony(i).setWar(c.getNum());
                        c.getTerrain().getMF().addText(c.getNum() + " st war " + i);
                        //todo log
                    }
                }
                goHome();
                return;
            }
        }
        c.getTerrain().addFer(coord.getKey(), coord.getValue(), c.getNum(), FER_PER_MOVE);
        if (blockList.size() > 700) {
            for (Pair<Integer, Integer> coor : blockList) {
                c.getTerrain().addFer(coor.getKey(), coor.getValue(), c.getNum(), -FER_PER_MOVE);
            }
        }
    }

}
