class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==temp){
                    a[0]=i;
                    a[1]=j;return a;
                }
            }
        }
        return a;
    }
}