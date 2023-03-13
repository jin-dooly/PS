package Y2023.March.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class q11403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[][] G = new String[n+1][n+1];
        for(int i=0; i<n; i++){
            G[i] = br.readLine().split(" ");
        }

        int[][] result = new int[n][n];
        for(int i=0;i<n; i++){
            Queue<Integer> pq = new LinkedList<>();
            boolean[] visit = new boolean[n];
            pq.add(i);
            while(!pq.isEmpty()){
                int j = pq.poll();
                if(visit[j]) continue;
                visit[j] = true;
                for(int k=0; k<n; k++){
                    if(G[j][k].equals("1")){
                        result[i][k] = 1;
                        pq.add(k);
                    }
                }
            }
        }
        for(int[] i : result){
            for(int j : i)
                sb.append(j).append(" ");
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
