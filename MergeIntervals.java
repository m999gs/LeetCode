class Solution {
    public int[][] merge(int[][] inter) {
        sort(inter,0,inter.length-1);
        int count=0;
        for(int i=0;i<inter.length-1;i++){
            if(inter[i][1]>=inter[i+1][0]&&inter[i][0]<=inter[i+1][1]){
                inter[i+1][0]=inter[i+1][0]<inter[i][0]?inter[i+1][0]:inter[i][0];
                inter[i+1][1]=inter[i+1][1]>inter[i][1]?inter[i+1][1]:inter[i][1];
                inter[i][0]=Integer.MIN_VALUE;
                count+=1;
            }
        }
        int k=0;
        int a[][]=new int[inter.length-count][2];
        for(int i=0;i<inter.length;i++){
            if(inter[i][0]!=Integer.MIN_VALUE){
                a[k][0]=inter[i][0];
                a[k++][1]=inter[i][1];
            }
        }
        return a;
    }
    public void sort(int[][] arr,int l,int r){
        if(l<r){
            int m=(l+r)/2;
            
            sort(arr,l,m);
            sort(arr,m+1,r);
            
            merge(arr,l,m,r);
        }
    }
    public void merge(int[][] arr,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        
        int L[][]=new int[n1][2];
        int R[][]=new int[n2][2];
        
        for(int i=0;i<n1;i++){
            L[i][0]=arr[l+i][0];
            L[i][1]=arr[l+i][1];
        }
        for(int i=0;i<n2;i++){
            R[i][0]=arr[m+1+i][0];
            R[i][1]=arr[m+1+i][1];
        }
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(L[i][0]<=R[j][0]){
                arr[k][0]=L[i][0];
                arr[k++][1]=L[i++][1];
            }
            else{
                arr[k][0]=R[j][0];
                arr[k++][1]=R[j++][1];
            }
        }
        while(i<n1){
            arr[k][0]=L[i][0];
            arr[k++][1]=L[i++][1];
        }
        while(j<n2){
            arr[k][0]=R[j][0];
            arr[k++][1]=R[j++][1];
        }
    }
}