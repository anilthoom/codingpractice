package com.anilt.meta.warmup;

public class AllWrong {
    public static void main(String[] args) {
        AllWrong allWrong = new AllWrong();
        String output = allWrong.getWrongAnswers(5, "ABABA");
        System.out.println(output);
    }
    public String getWrongAnswers(int N, String C){
        String output = "";
        for(int i=0; i<N; i++){
            if(C.charAt(i) == 'A')
                output += "B";
            else
                output += "A";
        }
        return output;
    }
}
