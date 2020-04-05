package com.springmvc.leetcode.meiriyiti;

public class mianshiti17_16 {
    public static void main(String[] args) {
            int[] nums=new int[]{2,1,4,5,3,1,1,3};
        System.out.println(massage(nums));
    }
    public static int massage(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int[] dp=new int[nums.length];
        int i;
        dp[0]=nums[0];
        dp[1]=nums[0]>nums[1]?nums[0]:nums[1];
        for(i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[i-1];
    }
}
