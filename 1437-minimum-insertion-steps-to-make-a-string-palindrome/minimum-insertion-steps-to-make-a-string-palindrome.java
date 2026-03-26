class Solution {
    int dp[][];
    public int minInsertions(String s) {
        int n=s.length();
        dp=new int[n+1][n+1];
        StringBuilder sb=new StringBuilder("");
        for(int i=n-1;i>=0;i--){
            char x=s.charAt(i);
            sb.append(x);
        }
        String rev=sb.toString();
        dp=new int[n+1][n+1];


        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        return n-dp[n][n];
    }
}