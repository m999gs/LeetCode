class Solution {
    public int firstMissingPositive(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int x:nums){
            if(x>0){
                l.add(x);
            }
        }
        for(int i=1;;i++){
            if(!l.contains(i))return i;
        }
    }
}