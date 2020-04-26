package tiku;

public class leetcode279 {
    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }

    public static int numSquares(int n) {
        int[] dp=new int[n+1];
        for(int i = 1; i <= n; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j*j<=n;j++){
                if(i>=j*j){
                    dp[i]=Math.min(dp[i],dp[i-j*j]+1);
                }
            }
        }
        return dp[n];
    }
}
