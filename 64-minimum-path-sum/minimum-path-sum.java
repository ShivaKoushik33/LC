class Solution {
    int dp[][];
    public int fn(int i,int j,int grid[][],int m,int n){
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }

        if(i>=m || j>=n){
            return (int)1e9;
        }
         if (dp[i][j] != -1) return dp[i][j];

        int down=grid[i][j]+fn(i+1,j,grid,m,n);
        int right=grid[i][j]+fn(i,j+1,grid,m,n);

        return dp[i][j]=Math.min(down,right);
    }

    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        dp=new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
       return  fn(0,0,grid,m,n);
    }
}