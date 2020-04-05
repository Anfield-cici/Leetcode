package com.springmvc.leetcode.meiriyiti;

public class leetcode912 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,6,5,7};
        sortArray(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static int[] sortArray(int[] nums) {
       int l=(nums.length)/2-1;
       for(int i=l;i>=0;i--){
           int temp=i;
           int gg=i;
          while(true){
              if(2*temp+2<nums.length){
                  temp=nums[2*temp+2]>nums[2*temp+1]?2*temp+2:2*temp+1;
              }else if(2*temp+1<nums.length){
                  temp=2*temp+1;
              }else{
                  break;
              }
              if(nums[temp]>nums[gg]){
                  int tar=nums[temp];
                  nums[temp]=nums[gg];
                  nums[gg]=tar;
                  gg=temp;
              }
          }



       }
       heapSort(nums);
       return nums;
    }
    public static void heapSort(int[] nums){
        for(int i=nums.length-1;i>0;i--){
            int temp=nums[0];
            nums[0]=nums[i];
            nums[i]=temp;
            int j=0;
            while(j<nums.length/2){
                int gen;
                if(2*j+2<i){
                    gen=nums[2*j+2]>nums[2*j+1]?2*j+2:2*j+1;
                }else if(2*j+1<i){
                    gen=2*j+1;
                }else{
                    break;
                }
                if(nums[j]<nums[gen]){
                    int tt=nums[j];
                    nums[j]=nums[gen];
                    nums[gen]=tt;
                    j=gen;
                }else{
                    break;
                }

            }
        }
    }


}
