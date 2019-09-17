class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        List<Integer> l=new ArrayList<>();
        if(words.length==0||s.length()==0)return l;
        int a=words.length;
        int b=words[0].length();
        int n=a*b;
        String str="",t;
        
        for(String x:words)str+=x;
        for(int i=0;i+n<=s.length();i++){
            if(str.contains(s.substring(i,i+b))){
                t=s.substring(i,i+n);
                if(compare(str,t,b)){
                    l.add(i);
                }
            }
        }
        return l;
    }
    public static boolean compare(String s1,String s2,int b){
        int a;
        String temp;
        while(s1.length()>0){
            if(s1.equals(s2))return true;
            if(s2.contains(s1.substring(0,b))){
                temp=s1.substring(0,b);
                for(int i=0;i+b<=s2.length();i+=b){
                    if(temp.equals(s2.substring(i,i+b))){
                        s2=s2.substring(0,i)+s2.substring(i+b);
                        
                    }
                }
                s1=s1.substring(b);
                if(s1.length()!=s2.length())return false;
            }
            else{
                return false;
            }
        }
        return true;
    }
}