class Solution {
    public String addBinary(String a, String b) {
        String carry="0";
        String res="";
        int n1=a.length();
        int n2=b.length();
        int i=n1-1,j=n2-1;
        while(i>=0&&j>=0){
            if(a.charAt(i)=='1'&&b.charAt(j)=='1'&&carry.equals("0")){
                res="0"+res;carry="1";
            }
            else if(a.charAt(i)=='1'&&b.charAt(j)=='1'&&carry.equals("1")){
                res="1"+res;carry="1";
            }
            else if((a.charAt(i)=='0'&&b.charAt(j)=='1'||a.charAt(i)=='1'&&b.charAt(j)=='0')&&carry.equals("1")){
                res="0"+res;carry="1";
            }
            else if((a.charAt(i)=='0'&&b.charAt(j)=='1'||a.charAt(i)=='1'&&b.charAt(j)=='0')&&carry.equals("0")||a.charAt(i)=='0'&&b.charAt(j)=='0'&&carry.equals("1")){
                res="1"+res;carry="0";
            }
            else{
                res="0"+res;carry="0";
            }
            i--;j--;
        }
        while(i>=0){
            if(carry.equals("1")){
                if(a.charAt(i)=='1'){
                    res="0"+res;carry="1";
                }
                else{
                    res="1"+res;carry="0";
                }
            }
            else{
                res=a.charAt(i)+res;
            }i--;
        }
        while(j>=0){
        if(carry.equals("1")){
                if(b.charAt(j)=='1'){
                    res="0"+res;carry="1";
                }
                else{
                    res="1"+res;carry="0";
                }
            }
            else{
                res=b.charAt(j)+res;
            }j--;
        }
        if(carry.equals("1")){
            res="1"+res;
        }
        return res;
    }
}