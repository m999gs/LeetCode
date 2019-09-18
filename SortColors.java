class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int x:nums){
            if(x==0)zero++;
            else if(x==1)one++;
            else if(x==2)two++;
        }
        int l=0;
        while(zero>0){
            nums[l++]=0;
            zero--;
        }
        while(one>0){
            nums[l++]=1;
            one--;
        }
        while(two>0){
            nums[l++]=2;
            two--;
        }
    }
}