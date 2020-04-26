package tiku;

public class leetcode674 {
    public static void main(String[] args) {

    }

    public int findLengthOfLCIS(int[] nums) {
        int max=0;
        if(nums.length==0){
            return max;
        }
        int[] dp=new int[nums.length];
        dp[0]=1;
        int i=1;
        for(i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                dp[i]=dp[i-1]+1;
            }else{
                if(dp[i-1]>max){
                    max=dp[i-1];
                }
                dp[i]=1;
            }
        }
        return Math.max(dp[i-1],max);
    }
}
