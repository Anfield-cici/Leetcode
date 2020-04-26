package tiku;

import java.util.Arrays;

public class leetcode455 {
    public static void main(String[] args) {
        int[] g={1,2};
        int[] s={1,2,3};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);
       int j=0;
       for(int i=0;i<s.length;){
           if(s[i]>=g[j]){
               j++;
               if(j==g.length){
                   break;
               }
           }
           i++;
       }
       return j;
    }
}
