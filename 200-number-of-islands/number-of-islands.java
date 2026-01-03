class Solution {
    int m;
    int n;
    int visited[][];
    public void fn(int i,int j,int visited[][],char grid[][]){
        visited[i][j]=1;
        // left
        if (j - 1 >= 0 && visited[i][j - 1] != 1 && grid[i][j - 1] == '1') {
                fn(i, j - 1, visited, grid);
                }

        // right
        if (j + 1 < n && visited[i][j + 1] != 1 && grid[i][j + 1] == '1') {
            fn(i, j + 1, visited, grid);
        }

        // top
        if (i - 1 >= 0 && visited[i - 1][j] != 1 && grid[i - 1][j] == '1') {
            fn(i - 1, j, visited, grid);
        }

        // bottom
        if (i + 1 < m && visited[i + 1][j] != 1 && grid[i + 1][j] == '1') {
            fn(i + 1, j, visited, grid);
        }

        // top-left diagonal
        // if (i - 1 >= 0 && j - 1 >= 0 && visited[i - 1][j - 1] != 1 && grid[i - 1][j - 1] == '1') {
        //     fn(i - 1, j - 1, visited, grid);
        // }

        // // top-right diagonal
        // if (i - 1 >= 0 && j + 1 < n && visited[i - 1][j + 1] != 1 && grid[i - 1][j + 1] == '1') {
        //     fn(i - 1, j + 1, visited, grid);
        // }

        // bottom-left diagonal
        // if (i + 1 < m && j - 1 >= 0 && visited[i + 1][j - 1] != 1 && grid[i + 1][j - 1] == '1') {
        //     fn(i + 1, j - 1, visited, grid);
        // }

        // // bottom-right diagonal
        // if (i + 1 < m && j + 1 < n && visited[i + 1][j + 1] != 1 && grid[i + 1][j + 1] == '1') {
        //     fn(i + 1, j + 1, visited, grid);
        // }

        
    }
    public int numIslands(char[][] grid) {
         m=grid.length;
        n=grid[0].length;
        visited=new int [m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]!=1 && grid[i][j]=='1'){
                    System.out.println(i+" "+j);
                    count++;
                    fn(i,j,visited,grid);
                }
            }
        }
        return count;
    }
}