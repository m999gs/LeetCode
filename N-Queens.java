class Solution {
    public static int N;
    List<String> l;
    List<List<String>> list;
    public List<List<String>> solveNQueens(int n) {
        N=n;
        list=new ArrayList<>();
        String[][] arr=new String[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=".";
            }
        }
        nQueen(arr,0);
        return list;
    }
    public void nQueen(String[][] mat,int r){
        if(r==N){
        l=new ArrayList<>();
            for(int i=0;i<N;i++){
                String temp="";
                for(int j=0;j<N;j++){
                    temp+=mat[i][j];
                }
                l.add(temp);
            }
            list.add(l);
            return ;
        }
        for(int i=0;i<N;i++){
            if(isSafe(mat,r,i)){
                mat[r][i]="Q";
                nQueen(mat,r+1);
                mat[r][i]=".";
            }
        }
    }
    public boolean isSafe(String[][] mat,int r,int c){
        
        for(int i=0;i<r;i++)if(mat[i][c].equals("Q"))return false;
        
        for(int i=r,j=c;i>=0&&j>=0;i--,j--)if(mat[i][j].equals("Q"))return false;
        
        for(int i=r,j=c;i>=0&&j<N;i--,j++)if(mat[i][j].equals("Q"))return false;
        
        return true;
    }
}