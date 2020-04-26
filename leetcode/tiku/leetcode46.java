package tiku;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class leetcode46 {
    public static void main(String[] args) {

        int[] nums={-1,1,0};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i]);
        }
        System.out.println(sb.toString());

      /*List<List<Integer>> list=permute(nums);
        for(List l:list){
            for(Object ll:l){
                System.out.print(ll+"");
            }
            System.out.println();
        }*/

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> listList=new ArrayList<List<Integer>>();
        if(nums.length==0){
            return listList;
        }
        List<String> list=new ArrayList<String>();
        list=permutehelper(0,nums,list);
        Collections.sort(list);

        for(String l:list){
            List<Integer> ll=new ArrayList<Integer>();
            for(int i=0;i<l.length();i++){
                ll.add(l.charAt(i)-'0');
            }
            listList.add(ll);
        }
       return listList;
    }

    public static List<String> permutehelper(int n,int[] nums,List list){
        if(n==nums.length-1){

            return list;
        }else{
            for(int i=n;i<nums.length;i++){
                if(i==n||nums[i]!=nums[n]){
                    swap(n,i,nums);
                    list=permutehelper(n+1,nums,list);
                    swap(n,i,nums);
                }
            }
            return list;
        }
    }

    public static void swap(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
