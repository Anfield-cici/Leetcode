package tiku;

import java.util.Arrays;

public class leetcode34 {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        nums=searchRange(nums,8);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int start;
        int end;
        int mid=(left+right)/2;
        while(left<=right){
             mid=(left+right)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                start=mid;
                end=mid;
                break;
            }
        }
        start=left(left,mid-1,nums,target);
        end=right(mid+1,right,nums,target);
        int[] result=new int[2];
        result[0]=start;
        result[1]=end;
        return result;
    }
    public static int left(int left,int right,int[] nums,int target){
        int start=right+1;
        if(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                start=mid;
                left(left,mid-1,nums,target);
            }else{
                right(mid+1,right,nums,target);
            }
        }
       return start;
    }

    public static int right(int left,int right,int[] nums,int target){
        int end=left-1;
        if(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target){
                end=mid;
                right(mid+1,right,nums,target);
            }else{
                left(left,mid-1,nums,target);
            }
        }
        return end;
    }

}
