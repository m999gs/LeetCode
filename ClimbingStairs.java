class Solution {
    public int climbStairs(int n) {
        int twos=0,ones,sum=1;
        while(twos*2<n){
            twos+=1;
            ones=n-(twos*2);
            if(ones<0)return sum;
            sum+=combi(twos,ones);
        }
        return sum;
    }
    public int combi(int x,int y){
        int min=x<=y?x:y;
        double res=1;
        for(int i=(x+y-min)+1;i<=x+y;i++){
            res*=i;
        }
        for(int i=2;i<=min;i++)res=res/i;
        return (int)Math.round(res);
    }
}