package tiku;

public class leetcode392 {
    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        char[] ss=s.toCharArray();
        char[] tt=t.toCharArray();
        for(;i<s.length()&&j<t.length();j++){
            if(tt[j]==ss[i]){
                i++;
            }
        }
        return i==s.length();
    }
}
