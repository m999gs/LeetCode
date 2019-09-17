class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                if(!h.containsKey(board[i][j])){
                    h.put(board[i][j],1);
                }
                else{
                    return false;
                }
            }
            h.clear();
        }
        h.clear();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]=='.')continue;
                if(!h.containsKey(board[j][i])){
                    h.put(board[j][i],1);
                }
                else{
                    return false;
                }
            }
            h.clear();
        }
        h.clear();
        for(int i=1;i<9;i+=3){
            for(int j=1;j<9;j+=3){
                for(int k=-1;k<2;k++){
                    for(int l=-1;l<2;l++){
                        if(board[i+k][j+l]=='.')continue;
                        if(!h.containsKey(board[i+k][j+l])){
                            h.put(board[i+k][j+l],1);
                        }
                        else{
                            return false;
                        }
                    }
                }
                h.clear();
            }
        }
        return true;
    }
}