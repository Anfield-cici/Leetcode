package tiku;

/**
 * 解题技巧：双指针
 */

public class leetcode11 {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        if(height.length==0){
            return 0;
        }
        int max=0;

        for(int i=0,j=height.length-1;i<j;){
            if(height[i]>height[j]){
                if(height[j]*(j-i)>max){
                    max=height[j]*(j-i);
                }
                j--;
            }else{
                if(height[i]*(j-i)>max){
                    max=height[i]*(j-i);
                }
                i++;
            }
        }
        return max;
    }
}
