package com.springmvc.leetcode.hotproblem;

public class leetcode283 {

    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {

        for(int i=0, j=0;i<nums.length&&j<nums.length;i++){
            if(nums[j]!=0){
                j++;
            }
            if(nums[i]!=0&&i>j){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
    }
}
