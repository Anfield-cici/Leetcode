package tiku;

import java.util.ArrayList;
import java.util.List;

public class leetcode139 {
    public static void main(String[] args) {
        String str="appledenapple";
        System.out.println(str.indexOf(""));
        List<String> list=new ArrayList<String>();
        list.add("leet");
        list.add("code");
        System.out.println(wordBreak(str,list));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.isEmpty()){
            return false;
        }
       String[] str= (String[]) wordDict.toArray(new String[0]);
        while(s.length()!=0){
            int length=s.length();
            for(int i=0;i<str.length;i++){
                if(s.indexOf(str[i])!=-1){
                    s=s.substring(0,s.indexOf(str[i]))+s.substring(s.indexOf(str[i])+str[i].length(),s.length());
                }
            }
            if(s.length()==length){
                break;
            }
        }
        return s.length()==0;
    }
}
