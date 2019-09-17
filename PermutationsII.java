class Solution {
    
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums==null || nums.length==0) return result;
        return permi(nums,nums.length,nums.length);
    }
    public List<List<Integer>> permi(int[] nums,int n,int k){
        if(k==1){
            List<Integer> l=new ArrayList<>();
            for(int x:nums)l.add(x);
            if(!result.contains(l))result.add(l);
        }
        int temp;
        for(int i=0;i<k;i++){
            temp=nums[i];
            nums[i]=nums[k-1];
            nums[k-1]=temp;
            
            permi(nums,n,k-1);
            
            temp=nums[i];
            nums[i]=nums[k-1];
            nums[k-1]=temp;
        }
        return result;
    }
}