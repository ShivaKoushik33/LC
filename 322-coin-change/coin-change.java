class Solution {
   int dp[][];
    public int fn(int coins[],int amount,int index,int count){
        if(amount==0 ){
            // ans=Math.min(ans,count);
            return 0;
        }
        if(dp[index][amount]!=-1){
            return (dp[index][amount]);
        }
        int take=(int)1e9;
        if(index==coins.length){
            return take;
        }
        
        if(amount>=coins[index]){
            take=1+fn(coins,amount-coins[index],index,count+1);
            // fn(coins,amount,index+1,count); 
        }
        // else{
         int leave=fn(coins,amount,index+1,count);
        // }

        return dp[index][amount]=Math.min(take,leave);
    }
    public int coinChange(int[] coins, int amount) {
        int count=0;
    dp=new int[coins.length+1][amount+1];
        // ans=Integer.MAX_VALUE;

       for(int i=0;i<=coins.length;i++){
        for(int j=0;j<=amount;j++){
            dp[i][j]=-1;
        }
       }


        int ans=fn(coins,amount,0,0);
        return ans>= 1e9?-1:ans;
    }
}