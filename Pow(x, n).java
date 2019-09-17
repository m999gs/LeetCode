class Solution {
    public double myPow(double x, int n) {
        if(n==0||x==1)return 1;
        if(n==1)return x;
        int negP=n<0?1:0;
        int negN=x<0?1:0;
        if(x==-1)return n%2==1?-1:1;
        x=Math.abs(x);
        double res=x;
        n=Math.abs(n)<2147483647?Math.abs(n):2147483647;
        if(n<-12345)return 0;
        for(int i=2;i<=n;i++){
            res*=x;
            if(res<0.00000001)return 0;
            if(negP==1&&(1/res)<0.00000001)return 0;
        }
        if(negN==1&&n%2==1){
            res=-res;
        }
        if(negP==1){
            return 1/res;
        }
        return res;
    }
}