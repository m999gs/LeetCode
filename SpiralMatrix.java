class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        
        int m=matrix.length;
        if(m==0)return list;int n=matrix[0].length;
        int count=0;
        for(int i=0;i<=m/2;i++){
            for(int j=i;j<n-i;j++){
                list.add(matrix[i][j]);count+=1;if(count==(n*m))return list;
            }
            for(int j=i+1;j<m-i-1;j++){
                list.add(matrix[j][n-i-1]);count+=1;if(count==(n*m))return list;
            }
            for(int j=n-i-1;j>=i;j--){
                list.add(matrix[m-i-1][j]);count+=1;if(count==(n*m))return list;
            }
            for(int j=m-i-2;j>i;j--){
                list.add(matrix[j][i]);count+=1;if(count==(n*m))return list;
            }
        }
        return list;
    }
}