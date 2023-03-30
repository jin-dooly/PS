import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Spot{
    int y;
    int x;
    int w;
    public Spot(int y, int x, int w){
        this.y = y;
        this.x = x;
        this.w = w;
    }
}

class Solution {
    public int solution(String[] board) {
        int answer = 0;
        int N = board.length;
        int M = board[0].length();
        int rx=0, ry=0, gx=0, gy=0; //ready x,y  goal x,y
        boolean[][] blocked = new boolean[N][M];
        boolean[][] visited = new boolean[N][M];
        Queue<Spot> q = new LinkedList<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                char ch = board[i].charAt(j);
                if(ch == '.') continue;
                if(ch == 'D') blocked[i][j] = true;
                else if(ch == 'R'){
                    rx = j;
                    ry = i;
                }
                else{
                    gx = j;
                    gy = i;
                }
            }
        }
        q.add(new Spot(ry, rx, 0));
        while(!q.isEmpty()){
            Spot now = q.poll();

            if(now.x==gx && now.y==gy) {
                answer = now.w;
                break;
            }

            if(visited[now.y][now.x]) continue;
            visited[now.y][now.x] = true;

            if(now.x != M-1){
                int i=now.x;
                while(i<M-1 && !blocked[now.y][i+1]){
                    i++;
                }
                q.add(new Spot(now.y, i, now.w+1));
            }
            if(now.x != 0){
                int i=now.x;
                while(i>0 && !blocked[now.y][i-1]){
                    i--;
                }
                q.add(new Spot(now.y, i, now.w+1));
            }
            if(now.y != N-1){
                int i=now.y;
                while(i<N-1 && !blocked[i+1][now.x]){
                    i++;
                }
                q.add(new Spot(i, now.x, now.w+1));
            }
            if(now.y != 0){
                int i=now.y;
                while(i>0 && !blocked[i-1][now.x]){
                    i--;
                }
                q.add(new Spot(i, now.x, now.w+1));
            }
        }

        return answer==0 ? -1 : answer;
    }
}
