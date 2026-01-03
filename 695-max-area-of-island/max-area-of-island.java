class Solution {
     int m;
    int n;
    int visited[][];
    public int fn(int i,int j,int visited[][],int grid[][],int c){
        visited[i][j]=1;
        c=c+1;
        // left
        if (j - 1 >= 0 && visited[i][j - 1] != 1 && grid[i][j - 1] == 1) {
                
                c=fn(i, j - 1, visited, grid,c);
                }

        // right
        if (j + 1 < n && visited[i][j + 1] != 1 && grid[i][j + 1] == 1) {
            
            c=fn(i, j + 1, visited, grid,c);
        }

        // top
        if (i - 1 >= 0 && visited[i - 1][j] != 1 && grid[i - 1][j] == 1) {
            
            c=fn(i - 1, j, visited, grid,c);
        }

        // bottom
        if (i + 1 < m && visited[i + 1][j] != 1 && grid[i + 1][j] == 1) {
            
            c=fn(i + 1, j, visited, grid,c);
        }
        return c;
    }



    public int maxAreaOfIsland(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        visited=new int [m][n];
        int count=0;
        int result=0;
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]!=1 && grid[i][j]==1){
                    // System.out.println(i+" "+j);
                   
                    count++;
                    ans=fn(i,j,visited,grid,0);
                    //  System.out.println(i+" "+j+"---"+ans);
                    result=Math.max(ans,result);
                }
            }
        }
        return result;
    }
}