package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q1260_1 {
    static StringBuilder sb = new StringBuilder();
    static int n, m, v;
    static boolean[][] nodeSet;
    public static void dfs(int target){
        nodeSet[target][0] = true;
        sb.append(target).append(' ');
        for(int i=1; i<=n; i++){
            if(!nodeSet[i][0] && !nodeSet[target][i]){
                dfs(i);
            }
        }
    }
    public static void bfs(boolean[][] node){
        Queue<Integer> que = new LinkedList<>();
        node[v][0] = true;
        que.add(v);
        sb.append(v).append(' ');
        while(!que.isEmpty()){
            int target = que.poll();
            for(int i=1; i<=n; i++){
                if(!node[i][0] && !node[target][i]){
                        node[i][0] = true;
                        que.add(i);
                        sb.append(i).append(' ');
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NMV = br.readLine().split(" ");
        n = Integer.parseInt(NMV[0]);
        m = Integer.parseInt(NMV[1]);
        v = Integer.parseInt(NMV[2]);
        nodeSet = new boolean[n+1][n+1];
        for(int i=0; i<n+1; i++){
            Arrays.fill(nodeSet[i], true);
        }
        for(int i=0; i<m; i++){
            String[] edge = br.readLine().split(" ");
            int n1 = Integer.parseInt(edge[0]);
            int n2 = Integer.parseInt(edge[1]);
            nodeSet[n1][0] = false;
            nodeSet[n2][0] = false;
            nodeSet[n1][n2] = false;
            nodeSet[n2][n1] = false;
        }
        boolean[][] copy = new boolean[n+1][n+1];
        for(int i=0; i<n+1; i++) {
            for(int j=0; j<n+1; j++) {
                copy[i][j] = nodeSet[i][j];
            }
        }
        dfs(v);
        sb.append('\n');
        bfs(copy);
        System.out.println(sb);
    }
}
