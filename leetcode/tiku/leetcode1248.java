package tiku;

import java.util.ArrayList;

public class leetcode1248 {
    public static void main(String[] args) {
        int[] nums={91473,45388,24720,35841,29648,77363,86290,58032,53752,87188,34428,85343,19801,73201};
        System.out.println(numberOfSubarrays(nums,4));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                list.add(i);
            }
        }
        int count=0;
        for(int i=0,j=k-1;j<list.size();i++,j++){
            int left=list.get(i);
            int right=list.get(j);
            count=count+find(left,right,nums);

        }
        return count;
    }


    public static int find(int left,int right,int[] nums){
        int count=0;
        boolean flag=false;
        for(int i=left;(i>=0&&nums[i]%2==0)||flag==false;i--){
            flag=true;
            for(int j=right+1;j<nums.length&&nums[j]%2==0;j++){
                count++;
            }
            count++;
        }
        return count;
    }
}
