class Solution {
    public String longestPalindrome(String s) {
        int num=0;
        int n=s.length();
        int temp=1;
        String t="";
        String Longest_String="";
        String ts;
        int flag=0;
        int j=1;
        while(j<=n) {
        	for(int i=0;i<=n-j;i++){
                t=s.substring(i,i+j);
                flag=0;
                temp=t.length();
                if(num<temp){
                for(int k=temp-1;k>=0;k--){
                    if(t.charAt(k)==t.charAt((temp-1)-k)){
                       flag=0; 
                    }
                    else{
                        flag=1;k=-1;
                    }
                }
                if(flag==0){num=temp;
                                Longest_String=t;
                                }
                }
                else{
                    i=n;
                }
            }
        	j++;
        }
        
        return Longest_String;
    }
}