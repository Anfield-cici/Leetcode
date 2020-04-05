package com.springmvc.leetcode.dp;


public class leetcode70 {

    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
        int a=1;
        int b=2;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        for(int i=3;i<=n;i++){
            int temp=a;
            a=b;
            b=a+temp;

        }
        return b;
    }
}
