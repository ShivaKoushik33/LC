class Solution {
    int dp[][];
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
        dp=new int[coins.length][amount+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        int ans=fn(coins.length-1,coins,amount);
        if(ans==(int)1e9){
            return -1;
        }
        return ans;
    }
}