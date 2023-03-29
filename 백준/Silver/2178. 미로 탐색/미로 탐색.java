import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
class Pair{
    int y;
    int x;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static char[][] maze;
    static boolean[][] check;
    static int n,m;
    static int bfs(){
        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(0,0));
        check[0][0] = true;
        int cnt = 0;
        while(!que.isEmpty()){
            cnt++;
            int qSize = que.size();
            for(int i=0; i<qSize; i++) {
                Pair me = que.poll();
                if(me.x==m-1 && me.y==n-1) {
                    que.clear();
                    break;
                }
                if (me.x < m - 1 && !check[me.y][me.x + 1] && maze[me.y][me.x + 1] == '1') {
                    que.add(new Pair(me.x + 1, me.y));
                    check[me.y][me.x + 1] = true;
                }
                if (me.y < n - 1 && !check[me.y + 1][me.x] && maze[me.y + 1][me.x] == '1') {
                    que.add(new Pair(me.x, me.y + 1));
                    check[me.y + 1][me.x] = true;
                }
                if (me.x > 0 && !check[me.y][me.x - 1] && maze[me.y][me.x - 1] == '1') {
                    que.add(new Pair(me.x - 1, me.y));
                    check[me.y][me.x - 1] = true;
                }
                if (me.y > 0 && !check[me.y - 1][me.x] && maze[me.y - 1][me.x] == '1') {
                    que.add(new Pair(me.x, me.y - 1));
                    check[me.y - 1][me.x] = true;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        maze = new char[n][m];
        check = new boolean[n][m];
        for(int i=0; i<n; i++){
            maze[i] = br.readLine().toCharArray();
        }
        System.out.println(bfs());
    }
}