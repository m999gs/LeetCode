class Solution {
    public boolean canJump(int[] nums) {
        int temp=0,max,k=0;
        for(int i=0;i<nums.length;i++){
            temp=nums[i];
            max=-1;k=i+1;
            if(temp+i>=nums.length-1)return true;
            if(temp==0)return false;
            for(int j=i+1;j<=temp+i;j++){
                if(max<=nums[j]){
                    max=nums[j];k=j;
                }
            }
            if((k+max)<(i+temp))k=i+temp;
            i=k-1;
        }
        return true;
    }
}