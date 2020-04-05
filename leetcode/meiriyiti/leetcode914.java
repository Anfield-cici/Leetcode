package com.springmvc.leetcode.meiriyiti;

import java.util.HashMap;
import java.util.Map;

public class leetcode914 {
    public static void main(String[] args) {

    }
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length==0){
            return false;
        }
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<deck.length;i++){
            if(map.get(deck[i])==null){
                map.put(deck[i],1);
            }else{
                map.put(deck[i],map.get(deck[i])+1);
            }
        }
        Integer g = -1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>0){
                if(g==-1){
                    g=entry.getValue();
                }else{
                    g=gcd(g,entry.getValue());
                }
            }
        }
        return g>2;
    }
    public int gcd(Integer x, Integer y) {
        return x == 0 ? y : gcd(y%x, x);
    }
}
