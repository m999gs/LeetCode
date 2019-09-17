class Solution {
    String[] keypad={" ","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> output=new ArrayList<>();
    public List<String> letterCombinations(String digits) { 
        if(digits.equals("")){
            return output;
        }
        if(digits.equals("0")||digits.equals("1")){
            return Arrays.asList(keypad[Integer.valueOf(digits)]);
        }
        
        combine("",digits);
        return output;
    }
    public void combine(String currentString, String nextDigits){
        if(nextDigits.length()==0){
            output.add(currentString);
            return ;
        }
        
        int digit=Integer.valueOf(nextDigits.substring(0,1));
        String s=keypad[digit];
        char[] chars=s.toCharArray();
        
        for(char c:chars){
            String temp=currentString+c;
            
            combine(temp,nextDigits.substring(1));
        }
    }
}