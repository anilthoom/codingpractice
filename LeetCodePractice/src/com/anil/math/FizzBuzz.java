package com.anil.math;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/743/
public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz =  new FizzBuzz();
        fizzBuzz.fizzBuzz(15);
    }
    public List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3 == 0 && i%5==0)
                resultList.add("FizzBuzz");
            else if(i%3 == 0)
                resultList.add("Fizz");
            else if(i%5 ==0)
                resultList.add("Buzz");
            else
                resultList.add(""+i);
        }
        return resultList;
    }
}
