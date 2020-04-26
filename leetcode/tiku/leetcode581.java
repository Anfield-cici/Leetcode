package tiku;

import java.util.Arrays;

public class leetcode581 {
    public static void main(String[] args) {
        int[] nums={1,9,9,8,0,5,1,2};
        int[] cp=new int[nums.length];
        System.arraycopy(nums,0,cp,0,nums.length);
        System.out.println(Arrays.toString(cp));
        merge(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public int findUnsortedSubarray(int[] nums) {
        int[] result=new int[nums.length];
        System.arraycopy(nums,0,result,0,nums.length);
        merge(nums,0,nums.length-1);
        int i=1;
        int j=nums.length-1;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=result[i])
                break;
        }
        for(j=nums.length-1;j>=0;j--){
            if(nums[j]!=result[j])
                break;
        }
        if(i<j){
            return j-i+1;
        }else{
            return 0;
        }

    }

    public static void merge(int[] arr,int start,int end){
        if(start==end) return ;
        int mid=(start+end)/2;
        merge(arr,start,mid);
        merge(arr,mid+1,end);



        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=end){
            temp[k++]=arr[i]>arr[j]?arr[j++]:arr[i++];
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        System.arraycopy(temp, 0, arr, start, end - start + 1);
    }
}
