import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        boolean[][] node = new boolean[n+1][n+1];
        for(int i=0; i<m; i++){
            String[] input = br.readLine().split(" ");
            int n1 = Integer.parseInt(input[0]);
            int n2 = Integer.parseInt(input[1]);
            node[n1][0] = true;
            node[n2][0] = true;
            node[n1][n2] = true;
            node[n2][n1] = true;
        }
        //bfs
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        node[1][0] = false;
        int cnt = 0;
        while(!que.isEmpty()){
            int target = que.poll();
            for(int i=1; i<=n; i++){
                if(node[i][0] && node[target][i]){
                    que.add(i);
                    node[i][0] = false;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
