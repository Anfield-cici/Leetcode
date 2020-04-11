package tiku;

public class leetcode14 {
    public static void main(String[] args) {
        System.out.println("leetcode".indexOf("leet"));
    }

    public static String longestCommonPrefix(String[] strs) {

        int j=0;
        StringBuilder sb=new StringBuilder();
        while(true){
            int i=0;
            for(i=0;i<strs.length-1;i++){
                if((j==strs[i].length()||j==strs[i+1].length())||strs[i].charAt(j)!=strs[i+1].charAt(j)){
                    break;
                }
            }
            if(i==0&&strs.length==1){
                sb.append(strs[0]);
                break;
            }else if(i== strs.length-1){
                sb.append(strs[i].charAt(j));
                j++;
            }else{
                break;
            }
        }
        return sb.toString();
    }
}
