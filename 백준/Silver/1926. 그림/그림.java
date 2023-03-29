import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static String[][] picture;
    static boolean[][] check;
    static int n,m;
    static int bfs(int x, int y){
        Queue<int[]> que = new LinkedList<>();
        int area = 1;
        que.add(new int[] {x,y});
        check[x][y] = true;
        while(!que.isEmpty()){
            int[] t = que.poll();
            if(t[1]<m-1 && !check[t[0]][t[1]+1] && picture[t[0]][t[1]+1].equals("1")) {
                que.add(new int[]{t[0], t[1] + 1});
                check[t[0]][t[1] + 1] = true;
                area++;
            }
            if(t[0]<n-1 && !check[t[0]+1][t[1]] && picture[t[0]+1][t[1]].equals("1")){
                que.add(new int[] {t[0]+1, t[1]});
                check[t[0]+1][t[1]] = true;
                area++;
            }
            if(t[0]>0 && !check[t[0]-1][t[1]] && picture[t[0]-1][t[1]].equals("1")){
                que.add(new int[] {t[0]-1, t[1]});
                check[t[0]-1][t[1]] = true;
                area++;
            }
            if(t[1]>0 && !check[t[0]][t[1]-1] && picture[t[0]][t[1]-1].equals("1")){
                que.add(new int[] {t[0], t[1]-1});
                check[t[0]][t[1]-1] = true;
                area++;
            }
        }
        return area;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        picture = new String[n][m];
        check = new boolean[n][m];
        for(int i=0; i<n; i++){
            picture[i] = br.readLine().split(" ");
        }
        int maxArea = 0, cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!check[i][j] && picture[i][j].equals("1")){
                    maxArea = Math.max(bfs(i,j), maxArea);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        System.out.println(maxArea);
    }
}
