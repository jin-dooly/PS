import java.util.*;

class Info{
    int row;
    int col;
    int dis;
    public Info(int r, int c, int d){
        row = r;
        col = c;
        dis = d;
    }
}
class Solution {
    static char[][] place;
    static int check(ArrayList<Info> p){
        int len = p.size();
        Queue<Info> que = new LinkedList<>();
        for(int i=0; i<len; i++){
            que.add(p.get(i));
            boolean[][] visit = new boolean[5][5];
            while(!que.isEmpty()){
                Info get = que.poll();
                if(get.dis>2 || place[get.row][get.col]=='X' || visit[get.row][get.col]) continue;
                if(get.dis!=0 && place[get.row][get.col]=='P') return 0;
                visit[get.row][get.col] = true;

                if(get.row>0) que.add(new Info(get.row-1, get.col, get.dis+1));
                if(get.row<4) que.add(new Info(get.row+1, get.col, get.dis+1));
                if(get.col>0) que.add(new Info(get.row, get.col-1, get.dis+1));
                if(get.col<4) que.add(new Info(get.row, get.col+1, get.dis+1));
            }
        }
        return 1;
    }
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for(int N=0; N<places.length; N++){
            place = new char[5][5];
            ArrayList<Info> p = new ArrayList<>();
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    place[i][j] = places[N][i].charAt(j);
                    if(place[i][j] == 'P') p.add(new Info(i, j, 0));
                }
            }
            answer[N] = check(p);
        }
        return answer;
    }
}