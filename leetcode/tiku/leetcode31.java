package tiku;


import java.util.Arrays;

public class leetcode31 {
    public static void main(String[] args) {
        int[] nums={5,1,1};
        nextPermutation(nums);
    }
    public static void nextPermutation(int[] nums) {
        int i=nums.length-1;
        int j=-1;
        while(i>0&&nums[i]<=nums[i-1]) {
            i--;
        }
        if(i>0){
            j=i-1;
            int tar=nums[j];
            while(i<nums.length&&nums[i]>tar){
                i++;
            }
           nums[j]=nums[--i];
            nums[i]=tar;

        }
        for(++j,i=nums.length-1;j<i;j++,i--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
