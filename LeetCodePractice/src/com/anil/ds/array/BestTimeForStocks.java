package com.anil.ds.array;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeForStocks {
    public static void main(String[] args) {
        BestTimeForStocks bestTimeForStocks = new BestTimeForStocks();
        int prices[] = {7,6,4,3,1};
        System.out.println(bestTimeForStocks.maxProfit(prices));
    }
    // Optimal solution - Two pointer approach.
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPointer = 0, sellPointer=1;
        int profit = 0;
        while (buyPointer < sellPointer && sellPointer<prices.length){
            profit = prices[sellPointer] - prices[buyPointer];
            if(profit < maxProfit){
                //Shift left pointer
                if(prices[sellPointer] < prices[buyPointer]){
                    buyPointer = sellPointer;
                }
            }
            else {
                maxProfit = profit;
            }
            sellPointer++;
        }
        return maxProfit;
    }
    public int maxProfitBrutForce(int[] prices) {
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
