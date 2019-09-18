class Solution {
    public int N;
    public int count=0;
    public int totalNQueens(int n) {
        N=n;
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        nQueen(arr,0);
        return count;
    }
    public void nQueen(char[][] mat,int r){
        if(r==N){
            count+=1;
            return;
        }
        
        for(int i=0;i<N;i++){
            if(isSafe(mat,r,i)){
                mat[r][i]='Q';
                nQueen(mat,r+1);
                mat[r][i]='.';
            }
        }
    }
    public boolean isSafe(char[][]mat ,int r,int c){
        for(int i=0;i<r;i++)if(mat[i][c]=='Q')return false;
        
        for(int i=r,j=c;i>=0&&j>=0;i--,j--)if(mat[i][j]=='Q')return false;
        
        for(int i=r,j=c;i>=0&&j<N;i--,j++)if(mat[i][j]=='Q')return false;
        
        return true;
    }
}