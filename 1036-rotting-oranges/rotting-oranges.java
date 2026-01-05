class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int []> q=new LinkedList<>();
        int cnt=0;
        int cnt_fresh=0;
        int visited[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    cnt++;
                }
                if(grid[i][j]==2){
                    q.add(new int[]{i,j,0});
                }
            }
        }
        int ans=0;
        while(!q.isEmpty()){
            int a[]=q.poll();
            // System.out.println(a[0]+"  "+ a[1]+"----"+a[2]);
            int x=a[0];
            int y=a[1];
            visited[x][y]=1;
            
            if(y+1<n && visited[x][y+1]!=1 && grid[x][y+1]==1){
                q.add(new int[]{x,y+1,a[2]+1});
                visited[x][y+1]=1;
                cnt_fresh++;
            }
            if(y-1>=0 && visited[x][y-1]!=1 && grid[x][y-1]==1){
                q.add(new int[]{x,y-1,a[2]+1});
                visited[x][y-1]=1;
                cnt_fresh++;
            }
            if(x+1<m && visited[x+1][y]!=1 && grid[x+1][y]==1){
                q.add(new int[]{x+1,y,a[2]+1});
                visited[x+1][y]=1;
                cnt_fresh++;
            }
            if(x-1>=0 && visited[x-1][y]!=1 && grid[x-1][y]==1){
                q.add(new int[]{x-1,y,a[2]+1});
                visited[x-1][y]=1;
                cnt_fresh++;
            }
            ans=a[2];
        }
        // System.out.println(cnt+" "+cnt_fresh+" "+ans);
        return cnt==cnt_fresh?ans:-1;
    }
}