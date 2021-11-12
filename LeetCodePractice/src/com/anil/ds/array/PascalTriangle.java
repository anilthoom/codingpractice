package com.anil.ds.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.generate(5);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        res.add(temp);
        if(numRows == 1)
            return res;
        for(int i=1; i<numRows; i++){
            List<Integer> innerRes = new ArrayList<>();
            innerRes.add(1);
            for (int j=0; j<temp.size()-1 & temp.size()>=2; j++){
                innerRes.add(temp.get(j)+temp.get(j+1));
            }
            innerRes.add(1);
            temp = innerRes;
            res.add(temp);
        }
        return res;
    }
}
