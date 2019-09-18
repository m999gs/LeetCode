class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())return "";
        if(t.length()==s.length()&&t.equals(s))return s;
        int min=Integer.MAX_VALUE;
        String res="";
        int count=0;
        String temp=t;
        for(int i=0;i<s.length();i++){
            if(t.contains(s.charAt(i)+"")){
                count=1;
                temp=t.replaceFirst(s.charAt(i)+"","");
                if(temp.length()==0)return t;
                for(int j=i+1;j<s.length();j++){
                    count++;
                    if(count>min)break;
                    if(temp.contains(s.charAt(j)+"")){
                    temp=temp.replaceFirst(s.charAt(j)+"","");
                        if(temp.length()==0){
                            if(count<min){
                            min=count;
                            res=s.substring(i,j+1);
                            }
                            else{
                                break;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}