class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],max=nums[0],x;
        for(int i=1;i<nums.length;i++){
            x=sum+nums[i];
            sum=nums[i]>(x)?nums[i]:(x);
            if(sum>max)max=sum;
        }
        return max;
    }
}