class Solution {
    public void nextPermutation(int[] nums) {
        int flag=0;
        int n=nums.length;
        if(n<2)return ;
        for(int i=0;i+1<nums.length;i++){
            if(!(nums[i]>=nums[i+1])){
                flag=1;break;
            }
        }
        if(flag==0){
            Arrays.sort(nums);
            return ;
        }
        else{
            for(int j=n-2;j>=0;j--){
                for(int i=n-1;i>j;i--){
                    if(nums[i]>nums[j]){
                        nums[i]+=nums[j];
                        nums[j]=nums[i]-nums[j];
                        nums[i]=nums[i]-nums[j];
                        for(int k=j+1;k<n;k++){
                            for(int l=k+1;l<n;l++){
                                if(nums[k]>nums[l]){
                                    nums[k]+=nums[l];
                                    nums[l]=nums[k]-nums[l];
                                    nums[k]=nums[k]-nums[l];
                                }
                            }
                        }
                    return ;
                    }
                }
            }
        }
    }
}