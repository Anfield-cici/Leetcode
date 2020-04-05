package com.springmvc.leetcode.hotproblem;

public class leetcode136 {
    public static void main(String[] args) {
        int[] nums=new int[]{4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int count=nums[0];
        for(int i=1;i<nums.length;i++){
            count=count^nums[i];
        }
        return count;
    }
}
