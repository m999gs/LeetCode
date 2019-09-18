class Solution {
    public String simplifyPath(String path) {
        Stack<String> str=new Stack<>();
        String s[]=path.split("/");
        for(String a:s){
            if(a.equals("..")){
                if(!str.isEmpty())str.pop();
            }
            else if(a.equals(".")){}
            else if(!a.equals("")){
                str.push(a);
            }
        }
        String res="";
        while(!str.isEmpty()){
            res="/"+str.peek()+res;
            str.pop();
        }
        return res.equals("")?"/":res;
    }
}