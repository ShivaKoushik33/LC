class Solution {
    public boolean isSafe(int board[][],int col,int row){
        int copyRow=row;
        int copyCol=col;
        int n=board.length;
        for(int i=0;i<col;i++){
            if(board[row][i]==1){
                return false;
            }
        }
            // top left diagonal
            while(row>0 && col>0){
                if(board[row-1][col-1]==1){
                    return false;
                }
                row--;
                col--;
            }
            row=copyRow;
            col=copyCol;

            while(row<(n-1) && col>0){
                if(board[row+1][col-1]==1){
                    return false;
                }
                row++;
                col--;
            }
        return true;
    }

    public void solve(int board[][],List<List<String>> ans,int col,int n){
        if(col==n){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder("");
                for(int j=0;j<n;j++){
                    if(board[i][j]==1){
                        sb.append("Q");
                    }
                    else{
                        sb.append(".");
                    }
                }
                temp.add(sb.toString());
            }
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=0;i<n;i++){
            if(isSafe(board,col,i)){
                board[i][col]=1;
                solve(board,ans,col+1,n);
                board[i][col]=0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
       int board[][]=new int[n][n];
       List<List<String>> ans=new ArrayList<>();
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]=0;
        }
       } 
       solve(board,ans,0,n);
        return ans;
    }
}