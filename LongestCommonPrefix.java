class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        String temp="";
        int k=1;
        int n=strs.length;
        int n1=Integer.MAX_VALUE;
        for(int x=0;x<n;x++){
            if(n1>strs[x].length())n1=strs[x].length();
        }
        while(n!=0 && k!=10000 && n1!=0){
            temp=strs[0].substring(0,k);
            for(int i=0;i<n;i++){
                if(temp.equals(strs[i].substring(0,k))){
                }
                else{
                    i=n;k=9999;
                    temp=s;
                }
            }
            if(k<=n1-1){
            k++;   
            }
            else{
                k=10000;
            }
            s=temp;
        }
        return s;
    }
}