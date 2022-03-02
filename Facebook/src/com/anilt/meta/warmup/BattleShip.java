package com.anilt.meta.warmup;

public class BattleShip {
    public static void main(String[] args) {
        BattleShip battleShip = new BattleShip();
        int[][] G= {{0,0,1}, {1,0,1}};
        System.out.println(battleShip.getHitProbability(2, 3, G));
    }
    public double getHitProbability(int R, int C, int[][] G){
        double probability = 0.0;
        double findings = 0.0;
        double total = R*C;
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(G[i][j] == 1)
                    findings += 1;
            }
        }
        return findings/total;
    }
}
