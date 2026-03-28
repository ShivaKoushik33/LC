class Solution {
    void fn( List<List<Integer>> l,int ind,int visited[]){
        visited[ind]=1;
        for(int x:l.get(ind-1)){
            if(visited[x]==-1){
                fn(l,x,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        int n=isConnected.length;
        int visited[]=new int[n+1];
        Arrays.fill(visited,-1);
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(isConnected[i][j]==1){
                        temp.add(j+1);
                    }
                }
            }
            l.add(new ArrayList<>(temp));
        }



        for(int i=1;i<=n;i++){
            if(visited[i]!=1){
                fn(l,i,visited);
                count++;
            }
        }
        return count;
    }
}