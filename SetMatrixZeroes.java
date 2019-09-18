class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        if(n==0)return;
        int m=matrix[0].length;
        if(m==0)return;
        List<String> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<n;k++){
                        if(matrix[k][j]!=0)l.add(k+" "+j);
                    }
                    for(int k=0;k<m;k++){
                        if(matrix[i][k]!=0)l.add(i+" "+k);
                    }
                }
            }
        }
        for(int i=0;i<l.size();i++){
            String s[]=l.get(i).split(" ");
            matrix[Integer.parseInt(s[0])][Integer.parseInt(s[1])]=0;
        }
    }
}