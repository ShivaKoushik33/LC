class Solution {
    int visited[];
    int count;
    public void fn(int Node,int visited[], List<List<Integer>> l){
        visited[Node]=1;
        for(int x:l.get(Node-1)){
            if(visited[x]!=1){
                 fn(x,visited,l);
            }
           
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        count=0;
        visited=new int[n+1];
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
            l.add((temp));
        }

        // for (List<Integer> innerList :l) {
        //     for (Integer val : innerList) {
        //         System.out.print(val + " ");
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=n;i++){
                if(visited[i]!=1){
                    count++;
                    fn(i,visited,l);
                }
        }




        return count;

    }
}