package tiku;

public class mianshiti08_11 {

    public static void main(String[] args) {

    }
    public int waysToChange(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        int[] coins={1,5,10,25};
        for(int i=0;i<4;i++){
            for(int j=1;j<=n;j++){
                if(j>=coins[i])
                    dp[j]=(dp[j]+dp[j-coins[i]])%1000000007;
            }
        }
        return dp[n];
    }
}
