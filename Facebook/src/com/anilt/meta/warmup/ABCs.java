package com.anilt.meta.warmup;

public class ABCs {
    public static void main(String[] args) {
        ABCs abCs = new ABCs();
        int sum = abCs.getSum(100, 100, 100);
        System.out.println(sum);
    }
    public int getSum(int A, int B, int C) {
        return A+B+C;
    }

}
