package com.springmvc.leetcode.hotproblem;


import java.util.HashMap;

public class leetcode169 {

    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        map.put("count",1);
        map.put("element",nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=map.get("element")){
                if(map.get("count")==0){
                    map.put("element",nums[i]);
                    map.put("count",map.get("count")+1);
                }else{
                    map.put("count",map.get("count")-1);
                }
            }else{
                map.put("count",map.get("count")+1);
            }
        }
        return map.get("element");
    }
}
