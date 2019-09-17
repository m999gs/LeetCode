class Solution {
    public List<String> list;
    public List<String> generateParenthesis(int n) {
        list = new ArrayList<String>();
        if(n<1)return list;
        combine("",0,0,n);
        return list;
    }
    public void combine(String current,int l,int r,int n){
        if(current.length()==(n*2)){
            list.add(current);
            return ;
        }
        if(l<n){
        combine(current+"(",l+1,r,n);   
        }
        if(r<n&&l>r){
        combine(current+")",l,r+1,n);
        }
        
    }
}