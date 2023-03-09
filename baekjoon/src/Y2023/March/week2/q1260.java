package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class q1260 {
    static StringBuilder sb = new StringBuilder();
    static int n, m, v;
    static boolean[][] nodeSet;
    public static void dfs(boolean[][] node){
        Stack<Integer> st = new Stack<>();
        node[v][0] = true;
        st.push(v);
        sb.append(v).append(' ');
        while(!st.isEmpty()){
            int target = st.peek();
            for(int i=1; i<=n; i++){
                node[0][0] = true;
                if(!node[i][0]){
                    if(!node[target][i]){
                        node[i][0] = true;
                        st.push(i);
                        sb.append(i).append(' ');
                        break;
                    }
                    node[0][0] = false;
                } else if(i==n){
                    if(node[0][0]) st.clear();
                    else st.pop();
                }
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
                node[0][0] = true;
                if(!node[i][0]){
                    if(!node[target][i]){
                        node[i][0] = true;
                        que.add(i);
                        sb.append(i).append(' ');
                    }
                    node[0][0] = false;
                }
            }
            if(node[0][0]) que.clear();
        }
    }
    public static boolean[][] copyNodeSet(){
        boolean[][] copy = new boolean[n+1][n+1];
        for(int i=0; i<n+1; i++) {
            for(int j=0; j<n+1; j++) {
                copy[i][j] = nodeSet[i][j];
            }
        }
        return copy;
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
        dfs(copyNodeSet());
        sb.append('\n');
        bfs(copyNodeSet());
        System.out.println(sb);
    }
}
