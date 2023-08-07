class Solution {
    public int solution(int[][] dots) {
        int answer = 0, col=0, row=0;
        row = dots[0][0]==dots[1][0] ? Math.abs(dots[3][0]-dots[0][0]): Math.abs(dots[1][0]-dots[0][0]);
        col = dots[0][1]==dots[1][1] ? Math.abs(dots[3][1]-dots[0][1]): Math.abs(dots[1][1]-dots[0][1]);
        return answer = row*col;
    }
}