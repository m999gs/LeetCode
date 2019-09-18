class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int k=1;
        for(int i=0;i<n;i++){
             for(int j=i;j<n-i;j++){
                arr[i][j]=k++;if(k-1==n*n)return arr;
            }
            for(int j=i+1;j<n-i-1;j++){
                arr[j][n-i-1]=k++;if(k-1==n*n)return arr;
            }
            for(int j=n-i-1;j>=i;j--){
                arr[n-i-1][j]=k++;if(k-1==n*n)return arr;
            }
            for(int j=n-i-2;j>i;j--){
                arr[j][i]=k++;if(k-1==n*n)return arr;
            }
        }
        return arr;
    }
}