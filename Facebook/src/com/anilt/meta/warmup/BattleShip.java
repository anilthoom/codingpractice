package com.anilt.meta.warmup;

public class BattleShip {
    public static void main(String[] args) {
        BattleShip battleShip = new BattleShip();
        int[][] G= {{0,0,1}, {1,0,1}};
        System.out.println(battleShip.getHitProbability(2, 3, G));
    }
    public double getHitProbability(int R, int C, int[][] G){
        return 0.0;
    }
}
