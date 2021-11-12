package com.anil.ds.array;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeForStocks {
    public static void main(String[] args) {
        BestTimeForStocks bestTimeForStocks = new BestTimeForStocks();
        int prices[] = {7,6,4,3,1};
        System.out.println(bestTimeForStocks.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++ ){
                if(prices[j]-prices[i] > maxProfit)
                    maxProfit = prices[j]-prices[i];
            }
        }
        return maxProfit;
    }
}
