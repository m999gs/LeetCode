class Solution {
    public boolean isPalindrome(int x) {
        String s="";
        s+=x;
        int num=s.length();
        String t="";
        for(int i=num-1;i>-1;i--){
            t+=s.charAt(i);
        }
        if(s.equals(t)){
         return true;   
        }
        else{
            return false;
        }
    }
}