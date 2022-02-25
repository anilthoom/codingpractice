package com.anilt.meta.warmup;

public class AllWrong {
    public static void main(String[] args) {
        AllWrong allWrong = new AllWrong();
        String output = allWrong.getWrongAnswers(3, "ABABA");
        System.out.println(output);
    }
    public String getWrongAnswers(int N, String C){
        StringBuffer stringBuffer = new StringBuffer(C);
        StringBuilder stringBuilder = new StringBuilder(C);
        stringBuilder.replace(0, N-1, "X");
        return stringBuilder.toString();
    }
}
