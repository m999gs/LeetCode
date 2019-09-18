class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int temp;
        String res="";
        for(int i=n;i>=1;i--){
            int num=facto(i-1);
            num=(k%num==0)?(k/num)-1:(k/num);
            if(num>=list.size()){
               num=(num%list.size());
            }
                temp=list.get(num);
                res+=temp;
                list.remove(num);
        }
        return res;
    }
    public int facto(int n){
        if(n==0||n==1)return 1;
        
        return n*facto(n-1);
    }
}