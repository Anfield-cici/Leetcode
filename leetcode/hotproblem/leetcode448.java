package com.springmvc.leetcode.hotproblem;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;

public class leetcode448 {
    public static void main(String[] args) {

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List list=new ArrayList();
        HashSet set=new HashSet();
        for(int i=0;i<nums.length;i++){
           set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return  list;
    }
}
