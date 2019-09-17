class Solution {
    public int myAtoi(String str) {
        double num=0;
        int flag=0,flag1=0,flag2=0;
        for(char c:str.toCharArray()){
            if((c==' '&&flag1==0&&flag==0&&flag2==0)){
                
            }
            else if(c=='+'&&flag1==0&&flag==0&&flag2==0){
                flag2=1;
            }
            else if(c=='-'&&flag1==0&&flag==0&&flag2==0){
                flag=1;
            }
            else if(((int)c)<58 && ((int)c)>47){
                num=(num*10)+((int)c-48);flag1=1;
            }
            else{
                break;
            }
        }
        if(flag==1){
            num=-num;
        }
        if(flag2==1&&flag==1) return 0;
        if(flag1==0)return 0;
        if(num<-2147483648)return -2147483648;
        if(num>2147483647) return 2147483647;
        
        return (int)num;
    }
}