class Solution {
    public int[] plusOne(int[] digits) {
        int flag=0;
        for(int i=digits.length-1;i>=0;i--){
            digits[i]+=1;
            if(i==0&&flag==0&&digits[i]>9){
                flag=1;
                digits[i]%=10;break;
            }
            if(digits[i]<10)return digits;
            if(digits[i]>9){
                digits[i]%=10;
            }
        }
        if(flag==1){
            int a[]=new int[digits.length+1];
            for(int i=digits.length;i>0;i--){
                a[i]=digits[i-1];
            }
            a[0]=1;
            return a;
        }
        return digits;
    }
}