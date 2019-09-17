class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(nums.length<4){
            return list;
        }
        int start=0,end=0;
        int sum;
        for(int i=0;i+3<nums.length;i++){
            for(int j=nums.length-1;j>i+2;j--){
            start=i+1;
            end=j-1;
            while(start<end){
                sum=nums[i]+nums[start]+nums[end]+nums[j];
                if((sum)==target){
                    if(!list.contains(Arrays.asList(nums[i],nums[start],nums[end],nums[j]))){
                    list.add(Arrays.asList(nums[i],nums[start],nums[end],nums[j]));
                    }
                    start++;
                }
                else if(sum<target){
                    start++;
                }
                else{
                    end--;
                }
            }
            }
        }
        return list;
    }
}