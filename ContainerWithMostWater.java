class Solution {
    public int maxArea(int[] height) {
        int max=-2,temp=0,x;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                x=height[i]<height[j]?height[i]:height[j];
                temp=((j-i)*x);
                
                if(max<temp)max=temp;
            }   
        }
        return max;
    }
}