package com.springmvc.leetcode.dp;



public class leetcode303 {
    private static int[] nums;
    public static void main(String[] args) {
        nums=new int[0];
        //nums=new int[]{-2, 0, 3, -5, 2, -1};
        leetcode303 l=new leetcode303(nums);
      /*  for(int i=0;i<6;i++){
            System.out.println(nums[i]);
        }*/
       int param= l.sumRange(3,5);
        System.out.println(param);
    }

    public  leetcode303(int[] nums) {
        int[] dp;
        if(nums==null||nums.length==0){
            dp=nums;
        }else{

            dp=new int[nums.length];
            dp[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                dp[i]=dp[i-1]+nums[i];
            }
        }

        this.nums=dp;
    }

    public static int sumRange(int i, int j) {
        if(nums==null||nums.length==0){
            return 0;
        }
       if(i==0){
           return nums[j];
       }
       return nums[j]-nums[i-1];
    }
}
