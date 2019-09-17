class Solution {
    public int trap(int[] height) {
        if(height.length==0)return 0;
        int index=0,max=-1,sum=0;
        for(int x=0;x<height.length;x++){
            if(height[x]>max){
                max=height[x];
                index=x;
            }
        }
        sum=twater(height,0,index,max);
        sum+=twater(height,index,height.length-1,max);
        
        return sum;
    }
    
    public int twater(int[] arr,int l,int r,int m){
        int n1=r-l+1;
        int minh=0,sum=0,temp=0;
        int a[]=new int[n1];
        
        if(l==0&&arr[0]!=m)for(int i=0;i<n1;i++)a[i]=arr[i];
        else for(int i=0;i<n1;i++)a[i]=arr[r-i];
        
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                for(int j=i+1;j<a.length;j++){
                    if(a[j]>=a[i]){
                        minh=a[i]<=a[j]?a[i]:a[j];
                        for(int k=i+1;k<j;k++){
                            temp=minh-a[k];
                            sum+=temp;
                        }
                        i=j-1;
                        break;
                    }
                }
            }
        }
        return sum;
    }
}