package com.springmvc.leetcode.hotproblem;

import java.util.HashMap;

public class leetcode01 {
    public static void main(String[] args) {
        int[] nums=new int[]{3,2,4};
        nums=twoSum(nums,6);
        System.out.println(nums[0]+"----"+nums[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        int[] temp=new int[2];
        for(i=0;i<nums.length-1;i++) {
            for (j = i + 1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    temp[0]=i;
                    temp[1]=j;
                    break;
                }
            }
        }
        return temp;
    }
}
