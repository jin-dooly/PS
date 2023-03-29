import java.util.*;
//[1,5,3,5,1,2,1,4]
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        int pick;
        for(int i : moves){
            for(int j=0; j<board.length; j++){
                pick = board[j][i-1];
                if(pick!=0){
                    if(!basket.empty() && basket.peek()==pick){
                        answer += 2;
                        basket.pop();
                    }else{
                        basket.push(pick);
                    }
                    board[j][i-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}