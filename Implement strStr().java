class Solution {
    public int strStr(String haystack, String needle) {
        int index=0;
        
        if(haystack.contains(needle)){
            index=needle.length();
            for(int i=0;i<haystack.length()-1;i++){
                System.out.print(i+" ");
                if(haystack.substring(i,i+index).equals(needle)){
                    return i;
                }
            }
        }
        else{
            return -1;
        }
        return 0;
    }
}