class Solution {
    int dp[][];
    int dp1[][];
    public int fn(int i,int coins[],int amount){
        if(i==0){
            if(amount%coins[i]==0){
                return amount/coins[i];
            }
            else{
                return (int)1e9;
            }
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        int take=Integer.MAX_VALUE;
        if(coins[i]<=amount){
            take=1+fn(i,coins,amount-coins[i]);
        }
        int leave=fn(i-1,coins,amount);
        return dp[i][amount]=Math.min(take,leave);
    }
    public int coinChange(int[] coins, int amount) {
        // dp=new int[coins.length][amount+1];
        dp1=new int[coins.length][amount+1];
        // for(int a[]:dp){
        //     Arrays.fill(a,-1);
        // }


        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0){
                dp1[0][i]=i/coins[0];
            }
            else{
                dp1[0][i]=(int)1e9;
            }
        }

        for(int i=1;i<coins.length;i++){
            for(int j=0;j<=amount;j++){
                 int leave=dp1[i-1][j];
                 int take=Integer.MAX_VALUE;
                 if(coins[i]<=j){
                    take=1+dp1[i][j-coins[i]];
                 }
                 dp1[i][j]=Math.min(leave,take);
            }
        }

        return dp1[coins.length-1][amount]==(int)1e9?-1:dp1[coins.length-1][amount];



        // int ans=fn(coins.length-1,coins,amount);
        // if(ans==(int)1e9){
        //     return -1;
        // }
        // return ans;
    }
}