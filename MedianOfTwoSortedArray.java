class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n1=a.length;
        int n2=b.length;
        int i=0,j=0;
        int num=0,num2=0,flag=0,flag1=0,flag2=0,count=0;
        
        if((n1+n2)%2==0)flag=1;
        
            while(count<=((n1+n2)/2)){
                if(n1!=0&&n2!=0){
                    if(flag1==0&&a[i]<=b[j]){
                        num=num2;
                        num2=a[i];
                        if(i<n1-1){
                        i++;
                        }
                        else{
                            flag1=1;
                        }
                    }
                    else{
                        if(flag2==0){
                            num=num2;
                            num2=b[j];
                            if(j<n2-1){
                            j++;   
                            }
                            else{
                                flag2=1;
                            }
                        }
                        else{
                            num=num2;
                        num2=a[i];
                        if(i<n1-1){
                        i++;
                        }
                        else{
                            flag1=1;
                        }
                        }
                    }
                }
                else if(n1==0){
                    num=num2;
                        num2=b[j];
                        if(j<n2-1){
                        j++;   
                        }
                }
                else if(n2==0){
                    num=num2;
                        num2=a[i];
                        if(i<n1-1){
                        i++;
                        }
                }
            count++;
        }
        
        if(flag==0){
            return num2;
        }
        else{
            return (double)(num+num2)/2;
        }
    }
}