class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list=new ArrayList<>();
        String temp="";
        int sum=0,diff=0;
        for(int i=0;i<words.length;i++){
            diff=maxWidth-sum;
            if(diff==maxWidth&&diff>=words[i].length()){
                temp=words[i];
                sum=words[i].length();
                if(sum==maxWidth){
                list.add(addSpaces(temp,maxWidth));
                sum=0;temp="";
                }
            }
            else if(diff>words[i].length()){
                temp+=" "+words[i];
                sum+=words[i].length()+1;
            }
            else if(diff<=words[i].length()){
                list.add(addSpaces(temp,maxWidth));
                sum=0;temp="";i--;
            }
        }
        if(sum!=0){
            diff=maxWidth-sum;
            for(int i=0;i<diff;i++){
                temp+=" ";
            }
            list.add(temp);
        }
        return list;
    }
    public String addSpaces(String s,int max){
        int spaceCount=max-s.length();
        int flag=0,space=0;
        while(spaceCount>0){flag=0;space=0;
            for(int i=0;i<s.length()&&spaceCount!=0;i++){
                if(s.charAt(i)!=' '){
                    flag=0;
                }
                else if(s.charAt(i)==' '&& flag==0){
                    flag=1;
                    s=s.substring(0,i+1)+" "+s.substring(i+1);
                    spaceCount--;space=1;
                }
            }
            if(space==0){
                s=s+" ";spaceCount--;
            }
        }
        return s;
    }
}