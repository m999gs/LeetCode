class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";
        String temp="",s="1";
        int count=0;
        char t=s.charAt(0);
        for(int i=1;i<n;i++){
            temp=s;
            s="";
            count=0;
            for(char c:temp.toCharArray()){
                if(c==t){
                    count++;
                }
                else{
                    if(count!=0)s+=count+""+t;
                    t=c;
                    count=1;
                }
            }
            if(s.equals("")||count!=0){
                s+=count+""+t;
            }
        }
        return s;
    }
}