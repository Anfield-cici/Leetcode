package com.springmvc.leetcode.dp;

/**
 * dp[i] ： 表示以 nums[i] 结尾的连续子数组的最大和
 * 状态转移方程：
 *   p[i] = max{num[i],dp[i-1] + num[i]}
 */

public class leetcode53 {

    public static void main(String[] args) {
        int[] nums=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static  int maxSubArray(int[] nums) {
        int dp[]=new int[nums.length];//dp数组含义：
        dp[0]=nums[0];
        int i;
        for(i=1;i<nums.length;i++){
            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
        }
        int res=dp[0];
        for(i=1;i<nums.length;i++){
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
