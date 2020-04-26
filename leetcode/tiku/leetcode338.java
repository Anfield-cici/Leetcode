package tiku;

import java.util.Arrays;

public class leetcode338 {
    public static void main(String[] args) {
        int[] result=countBits(8);
        System.out.println(Arrays.toString(result));
    }
    public static int[] countBits(int num) {
        int dp[]=new int[num+1];
        for(int i=0;i<=num;i++){
            dp[i]=dp[i/2]+i%2;
        }
        return dp;
    }
}
