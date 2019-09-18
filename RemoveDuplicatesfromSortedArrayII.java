class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        int count=1;
        int temp=-1;
        for(int x:nums){
            if(count==2&&temp==x)continue;
            else if(temp==x&&count<2){
                count++;
                nums[j++]=x;
            }
            else{
                count=1;
                temp=x;
                nums[j++]=x;
            }
        }
        return j;
    }
}