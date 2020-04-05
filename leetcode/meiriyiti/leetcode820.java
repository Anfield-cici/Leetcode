package com.springmvc.leetcode.meiriyiti;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class leetcode820 {
    public static void main(String[] args) {
        String[] words=new String[]{"time", "me", "bell"};
        minimumLengthEncoding(words);
    }
    public static int minimumLengthEncoding(String[] words) {
        Set<String> good = new HashSet(Arrays.asList(words));
        for(String s:good){
            System.out.println(s);
        }
        for(String str:words){
            for(int i=1;i<str.length();i++){
                good.remove(str.substring(i));
            }
        }
        for(String s:good){
            System.out.println(s);
        }
        int total=0;
        for(String str:good){
            total=str.length()+1;
        }
        return total;
    }
}
