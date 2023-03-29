import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    private static final int INF = Integer.MAX_VALUE;
    static class Node implements Comparable<Node>{
        int num;
        int weight;

        public Node(int n, int w){
            num = n;
            weight = w;
        }

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        int start = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Node>> eList= new ArrayList<>();
        for(int i=0; i<=V; i++){
            eList.add(new ArrayList<Node>());
        }

        for(int i=0; i<E; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            eList.get(u).add(new Node(v, w));
        }

        int[] dist = new int[V+1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        boolean[] visit = new boolean[V+1];
        PriorityQueue<Node> que = new PriorityQueue<>();
        que.add(new Node(start, 0));

        while(!que.isEmpty()){
            Node now = que.poll();
            if(visit[now.num]) continue;
            visit[now.num] = true;

            for (Node next : eList.get(now.num)){
                if(visit[next.num]) continue;
                dist[next.num] = Math.min(dist[next.num], dist[now.num]+next.weight);
                que.add(new Node(next.num, dist[next.num]));
            }
        }

        for(int i=1; i<dist.length; i++){
            if(dist[i]==INF) sb.append("INF").append('\n');
            else sb.append(dist[i]).append('\n');
        }
        System.out.println(sb);
    }
}
