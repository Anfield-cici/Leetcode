package com.springmvc.leetcode.meiriyiti;

public class mianshiti62 {
    public static void main(String[] args) {

    }

    public int lastRemaining(int n, int m) {

        int last=0;
        for(int i=2;i<=n;i++){
            last=(last+m)%i;
        }
        return last;
    }
}
