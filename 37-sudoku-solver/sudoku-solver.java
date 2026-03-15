class Solution {
    boolean isValid(char[][] board,int i,int j,int element){
        char x=(char) (element+'0');
    int cr=((i)/3);
    cr=cr*3;
    int cl=((j)/3);
    cl=cl*3;
        //col checking
        for(int l=cr;l<(cr+3);l++){
            for(int m=cl;m<(cl+3);m++){
                if(x==board[l][m]){
                    return false;
                }
            }
        }
        //row checking
        for(int l=0;l<9;l++){
            if(x==board[l][j]){
                return false;
            }
        }
        for(int l=0;l<9;l++){
            if(x==board[i][l]){
                return false;
            }
        }
        return true;
    }
    boolean insert(char [][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(int k=1;k<=9;k++){
                        if(isValid(board,i,j,k)){
                            board[i][j]=(char)(k+'0');

                           if( insert(board)){
                                return true;
                           };
                            board[i][j]='.';
                        }
                        
                        
                    }
                    return false;
                }
                
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        insert(board);
    }
}