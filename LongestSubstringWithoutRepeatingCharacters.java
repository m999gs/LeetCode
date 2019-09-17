import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0,num=0,n,x;String temp;
        n=s.length();
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        
        for(int i=0;i<=n;i++) {
			for(int j=i+1;j<=n;j++) {
				temp=s.substring(i,j);
                x=temp.length();
                if(num>=x){
                    temp="";//mmmm
                }
                h.clear();count=0;
				for(char c:temp.toCharArray()){
                    if(!h.containsKey(c)){
                    h.put(c,1);
                    count++;
                    }
                    else{j=n+1;break;
                    }
                }
                if(num<count)num=count;
			}
		}
        return num;
    }
}