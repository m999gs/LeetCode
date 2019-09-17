class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        char top='\u0000';
        if(n==0)return true;
        else if(n<2)return false;
        char[] stack=new char[n];
        int index=-1;
        for(char c:s.toCharArray()){
            if((c=='}'&&top=='{')||(c==')'&&top=='(')||(c==']'&&top=='[')){
                stack[index]='\u0000';
                index--;
                if(index>-1){
                top=stack[index];
                }
            }
            else{index++;
                stack[index]=c;
                top=c;
            }
        }
        if(stack[0]=='\u0000')return true;
        else{
            return false;
        }
    }
    
}