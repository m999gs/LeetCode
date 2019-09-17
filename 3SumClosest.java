class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int n=0;
        int temp=0;
        for(int i=0;i+2<nums.length;i++){
            for(int j=i+1;j+1<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    temp=Math.abs(nums[i]+nums[j]+nums[k]-target);
                    if(temp<min){
                        n=nums[i]+nums[j]+nums[k];
                        min=temp;
                    }
                }
            }
        }
        return n;
    }
}