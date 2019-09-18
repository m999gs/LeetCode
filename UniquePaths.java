class Solution {
    public int uniquePaths(int m, int n) {
    int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0){
                    arr[i][j]=1;continue;
                }
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[n-1][m-1];
    }
}