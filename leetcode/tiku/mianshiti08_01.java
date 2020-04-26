package tiku;

public class mianshiti08_01 {

    public static void main(String[] args) {

    }
    public int waysToStep(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        if(n>=3) {
            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000007;
            }
        }
        return dp[n];
    }
}
