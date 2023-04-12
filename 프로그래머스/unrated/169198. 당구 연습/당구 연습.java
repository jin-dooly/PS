class Solution {
    static int sx, sy;
    static int cal(int ex, int ey){
        int x = Math.abs(sx-ex);
        int y = Math.abs(sy-ey);
        return (int)Math.pow(x,2) + (int)Math.pow(y,2);
    }
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        sx = startX;
        sy = startY;
        for(int i=0; i<balls.length; i++){
            int endX = balls[i][0];
            int endY = balls[i][1];
            int min = Integer.MAX_VALUE;
            
            //up down left right
            if(startX!=endX || startY>endY) min = Math.min(min, cal(endX, n + (n-endY)));
            if(startX!=endX || startY<endY) min = Math.min(min, cal(endX, endY*-1));
            if(startY!=endY || startX<endX) min = Math.min(min, cal(endX*-1, endY));
            if(startY!=endY || startX>endX) min = Math.min(min, cal(m+(m-endX), endY));
            
            answer[i] = min;
        }
        return answer;
    }
}