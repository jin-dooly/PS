package Y2023.March.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class q1005 {
    static int n,k,w;
    static String[] time;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static PriorityQueue<Integer> pq;
    static int[] inDegree;

    static int topology(){
        int[] sum = new int[n+1];

        for(int i=1; i<=n; i++) {
            if (inDegree[i] == 0) {
                pq.add(i);
                sum[i] = Integer.parseInt(time[i-1]);
            }
        }

        while(true){
            int x = pq.poll();
            if(x ==w) return sum[w];

            for (int y : list.get(x)) {
                inDegree[y]--;
                if (inDegree[y] == 0) pq.add(y);
                sum[y] = Math.max(sum[y], Integer.parseInt(time[y - 1])+sum[x]);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            time = br.readLine().split(" ");
            list = new ArrayList<>();
            pq = new PriorityQueue<>();

            for(int j=0; j<=n; j++)
                list.add(new ArrayList<>());
            inDegree = new int[n+1];
            for(int i=0; i<k; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                list.get(x).add(y);
                inDegree[y]++;
            }

            w = Integer.parseInt(br.readLine());

            sb.append(topology()).append('\n');
        }
        System.out.println(sb);
    }
}
