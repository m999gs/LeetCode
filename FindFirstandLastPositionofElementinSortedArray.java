class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        int l=0;
        int r=nums.length-1;
        int m=0;
        int temp=-1;
        while(l<=r){
            m=(l+r)/2;
            if(nums[m]==target){
                l=r+1;
                temp=m;
            }
            else if(nums[m]<target){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        if(temp==-1){
         a[0]=-1;
            a[1]=-1;
            return a;
        }
        l=temp;
        r=temp;
        while(l>-1&&nums[l]==target){
            l--;
        }a[0]=++l;
        while(r<nums.length&&nums[r]==target){
            r++;
        }a[1]=--r;
        
        return a;
    }
}