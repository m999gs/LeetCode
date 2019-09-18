class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        if(n==0)return false;
        int m=matrix[0].length;
        if(m==0)return false;
        for(int i=0;i<n;i++){
            if(target>=matrix[i][0]&&target<=matrix[i][m-1]){
                for(int j=0;j<m;j++){
                    if(matrix[i][j]==target)return true;
                }
                return false;
            }
        }
        return false;
    }
}