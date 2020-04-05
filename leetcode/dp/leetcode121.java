package com.springmvc.leetcode.dp;



public class leetcode121 {

    public static void main(String[] args) {
        int[] prices=new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        if(prices.length==0||prices.length==1){
            return 0;
        }
        int max=0;//今天之前的最小值买入，今天卖出的价钱
        int min=prices[0];//今天购入之前买入的最小值
        for(int i=1;i<prices.length;i++){
            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);
        }

        return max;
    }
}
