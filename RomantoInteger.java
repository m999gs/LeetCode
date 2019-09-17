class Solution {
    	public int romanToInt(String s) {
        int num=0;
        while(s.length()!=0) {
	        if(s.length()>=2 && (s.substring(0,2)).equals("CM")) {
	        	num+=900;
	        	s=s.substring(2);
	        }
	        else if(s.length()>=1 && (s.substring(0,1)).equals("M")){
	        	num+=1000;
	        	s=s.substring(1);
	        }
	        else if(s.length()>=2 && (s.substring(0,2)).equals("CD")){
	        	num+=400;
	        	s=s.substring(2);
	        }
	        else if(s.length()>=1 && (s.substring(0,1)).equals("D")){
	        	num+=500;
	        	s=s.substring(1);
	        }
	        else if(s.length()>=1 && (s.substring(0,1)).equals("C")){
	        	num+=100;
	        	s=s.substring(1);
	        }
	        else if(s.length()>=2 && (s.substring(0,2)).equals("XC")){
	        	num+=90;
	        	s=s.substring(2);
	        }
	        else if(s.length()>=2 && (s.substring(0,2)).equals("XL")){
	        	num+=40;
	        	s=s.substring(2);
	        }
	        else if(s.length()>=1 && (s.substring(0,1)).equals("L")){
	        	num+=50;
	        	s=s.substring(1);
	        }
	        else if(s.length()>=1 && (s.substring(0,1)).equals("X")){
	        	num+=10;
	        	s=s.substring(1);
	        }
	        else if(s.length()>=2 && (s.substring(0,2)).equals("IX")){
	        	num+=9;
	        	s=s.substring(2);
	        }
	        else if(s.length()>=2 && (s.substring(0,2)).equals("IV")){
	        	num+=4;
	        	s=s.substring(2);
	        }
	        else if(s.length()>=1 && (s.substring(0,1)).equals("V")){
	        	num+=5;
	        	s=s.substring(1);
	        }
	        else if(s.length()>=1 && (s.substring(0,1)).equals("I")){
	        	num+=1;
	        	s=s.substring(1);
	        }
	        
        }
        return num;
    }
}