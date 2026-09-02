class Solution {
 int dp[][];
    int fn(int i,int j,String text1,String text2){
        if(i>=text1.length() || j>=text2.length()){
            
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(text1.charAt(i)==text2.charAt(j)){
            dp[i][j]=1+fn(i+1,j+1,text1,text2);
        }

        else{
           dp[i][j]= Math.max(fn(i+1,j,text1,text2),fn(i,j+1,text1,text2));
        }

        return dp[i][j];

    }
    public int longestCommonSubsequence(String text1, String text2) {
      
        int m=text1.length();
        int n=text2.length();
        dp=new int[m][n];
        for(int x[]:dp){
            Arrays.fill(x,-1);
        }
        return fn(0,0,text1,text2);
     
    }
}