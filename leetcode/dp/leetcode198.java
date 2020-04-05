package com.springmvc.leetcode.dp;



public class leetcode198 {

    public static void main(String[] args) {
        int[] nums=new int[]{2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static  int rob(int[] nums) {
        int length=nums.length;
        int i;
        if(length==0){
            return 0;
        }
        if(length==1){
            return nums[0];
        }
        if(length==2){
            return nums[0]>nums[1]?nums[0]:nums[1];
        }
        if(length==3){
            return nums[1]>nums[0]+nums[2]?nums[1]:nums[0]+nums[2];
        }
        int[] dp=new int[length];
        dp[0]=nums[0];
        dp[1]=nums[0]>nums[1]?nums[0]:nums[1];
        dp[2]=nums[1]>nums[0]+nums[2]?nums[1]:nums[0]+nums[2];
        for(i=3;i<length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],nums[i-1]+dp[i-3]);
        }
        return dp[i-1];
    }
}
