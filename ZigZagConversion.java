class Solution {
    public String convert(String s, int numRows) {
        int x=(numRows*2)-2;
        int x2=0,x3=0;
        String t="";
        int flag=0;
        int n=s.length();
        if(numRows>=2){
        for(int j=0;j<numRows;j++){
            //**********************************************
            if(j<numRows-1){
                x2=x-(2*j);
            }
            else{
                x2=x;
            }
            x3=x-x2;
            //**********************************************
            flag=0;
            for(int i=j;i<n;){
            
                if(flag==0){
                    t+=s.charAt(i);
                    i=i+x2;
                    flag=1;
                }
                else{
                    if(x3!=0){
                    t+=s.charAt(i);
                    i=i+x3;
                    }
                    flag=0;
                }
            }
            //**********************************************
        }
        }
        else{
            return s;
        }
        
        return t;
    }
}