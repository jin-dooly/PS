class Solution {
    static char[][] arr;
    boolean check(char ch){
        for(int i=0; i<3; i++){
            if(arr[i][0]==ch && arr[i][1]==ch && arr[i][2]==ch) return true;
            if(arr[0][i]==ch && arr[1][i]==ch && arr[2][i]==ch) return true;
        }
        if(arr[0][0]==ch && arr[1][1]==ch && arr[2][2]==ch) return true;
        if(arr[0][2]==ch && arr[1][1]==ch && arr[2][0]==ch) return true;
        return false;
    }
    public int solution(String[] board) {
        int answer = 1;
        arr = new char[3][3];
        int O = 0;
        int X = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = board[i].charAt(j);
                if(arr[i][j] == 'O') O++;
                else if(arr[i][j] == 'X') X++;
            }
        }
        if(O-1 == X){
            if(O>3 && check('X')) answer = 0;
        }
        else if(O == X){
            if(O>2 && check('O')) answer = 0;
        }
        else answer = 0;
        
        return answer;
    }
}