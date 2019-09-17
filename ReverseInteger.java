class Solution {
    public int reverse(int x) {
        int temp,flag=0;
        double num=0;
        if(x<0){
            flag=1;
            x=-x;
        }
        while(x>0){
            temp=x%10;
            num=(num*10)+temp;
            x=x/10;
        }
        if(flag==1){
            num=-num;
        }
        if(num>-2147483648 && num<2147483647)return (int)num;
    
        return 0;
    }
}