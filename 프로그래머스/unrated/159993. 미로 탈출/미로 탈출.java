import java.util.*;

class Pos{
    int y;
    int x;
    public Pos(int y, int x){
        this.y = y;
        this.x = x;
    }
}

class Solution {
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        char[][] map = new char[n][m];
        boolean[][] visit = new boolean[n][m];
        Queue<Pos> que = new LinkedList<>();
        
        int sx=0, sy=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = maps[i].charAt(j);
                if(map[i][j] == 'S'){
                    sx = j;
                    sy = i;
                }
            }
        }
        
        int sec = -1;
        boolean laver = false;
        que.add(new Pos(sy, sx));
        
        while(!que.isEmpty()){
            int len = que.size();
            sec++;
            for(int i=0; i<len; i++){
                Pos get = que.poll();
                
                if(map[get.y][get.x] == 'X' || visit[get.y][get.x]) continue;
                if(map[get.y][get.x] == 'E' && laver) return sec;
                if(map[get.y][get.x] == 'L' && !laver) {
                    laver = true;
                    sec--;
                    que.clear();
                    que.add(new Pos(get.y, get.x));
                    visit = new boolean[n][m];
                    break;
                }
                
                visit[get.y][get.x] = true;
                
                if(get.y>0) que.add(new Pos(get.y-1, get.x));
                if(get.y<n-1) que.add(new Pos(get.y+1, get.x));
                if(get.x>0) que.add(new Pos(get.y, get.x-1));
                if(get.x<m-1) que.add(new Pos(get.y, get.x+1));
            }
        }
        return -1;
    }
}