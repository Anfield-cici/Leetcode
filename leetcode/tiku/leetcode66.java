package tiku;

import java.util.Arrays;

public class leetcode66 {
    public static void main(String[] args) {
        int[] nums={9,9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    public static int[] plusOne(int[] digits) {
       int jin=1;
       int[] result=new int[digits.length+1];
       int i=digits.length-1;
       int j=result.length-1;
       for(;i>=0;i--,j--){
           int temp=digits[i]+jin;
           digits[i]=result[j]=temp%10;
           jin=temp/10;
           if(jin==0){
               break;
           }
       }
       if(i<0){
           result[j]=1;
           return result;
       }else{
           return digits;
       }
    }
}
