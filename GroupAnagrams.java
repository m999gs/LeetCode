class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result=new ArrayList<>();    
    List<String> list;
        HashMap<String,String> h=new HashMap<>();
        String temp,t;
        for(String s:strs){
            temp=alpha(s);
            if(h.containsKey(temp)){
                t=h.get(temp)+"%"+s;
                h.put(temp,t);
            }
            else{
                h.put(temp,s);
            }
        }
        for(String s:h.values()){
            list=new ArrayList<>();
            t="";
            for(char c:s.toCharArray()){
                if(c!='%'){
                 t+=""+c;   
                }
                else{
                    list.add(t);
                    t="";
                }
            }list.add(t);
            result.add(list);
        }
        return result;
    }
    public String alpha(String s){
        int n=s.length();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=(int)s.charAt(i);
        }
        Arrays.sort(a);
        s="";
        for(int i=0;i<n;i++){
            s+=""+(char)a[i];
        }
        return s;
    }
}