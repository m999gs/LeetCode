class Solution {
    public String intToRoman(int num) {
        String s="";
        int x=0;
        while(num>0){
          if(num/1000>0){
              x=num/1000;
              num=num%1000;
              for(int i=0;i<x;i++){
              s+="M";
              }
          }
            else if(num>=900){
                s+="CM";
                num=num%900;
            }
            else if(num>=500){
                x=num-500;
                x=x/100;
                s+="D";
                for(int i=0;i<x;i++){
                    s+="C";
                    num-=100;
                }
                num-=500;
            }
            else if(num>=400){
                s+="CD";
                num-=400;
            }
            else if(num>=100){
                x=num/100;
                for(int i=0;i<x;i++){
                    s+="C";
                }
                num%=100;
            }
            else if(num>=90){
                s+="XC";
                num-=90;
            }
            else if(num>=50){
                x=num-50;
                x=x/10;
                s+="L";
                for(int i=0;i<x;i++){
                    s+="X";
                    num-=10;
                }
                num-=50;
            }
            else if(num>=40){
                s+="XL";
                num-=40;
            }
            else if(num>=10){
                x=num/10;
                for(int i=0;i<x;i++){
                    s+="X";
                }
                num%=10;
            }
            else if(num>=9){
                s+="IX";
                num-=9;
            }
            else if(num>=5){
                x=num-5;
                s+="V";
                for(int i=0;i<x;i++){
                    s+="I";
                }
                num=0;
            }
            else if(num==4){
                s+="IV";
                num-=4;
            }
            else if(num>=1){
                for(int i=0;i<num;i++){
                    s+="I";
                }
                num=0;
            }
        }
        return s;
    }
}