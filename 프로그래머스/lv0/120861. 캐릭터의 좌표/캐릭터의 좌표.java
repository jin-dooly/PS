class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        board[0] = board[0]/2;
        board[1] = board[1]/2;
        for(String key : keyinput){
            if(key.equals("up")&&answer[1]<board[1]){
                answer[1]++;
            }else if(key.equals("down")&&answer[1]>-(board[1])){
                answer[1]--;
            }else if(key.equals("left")&&answer[0]>-(board[0])){
                answer[0]--;
            }else if(key.equals("right")&&answer[0]<board[0]){
                answer[0]++;
            }
        }
        return answer;
    }
}