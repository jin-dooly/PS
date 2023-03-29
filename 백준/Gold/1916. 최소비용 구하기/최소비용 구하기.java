import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static final int INF = Integer.MAX_VALUE / 16;
    static ArrayList<ArrayList<Node>> edge;
    static int dist[];
    static class Node implements Comparable<Node>{
        int n;
        int dist;
        public Node(int n, int d){
            this.n = n;
            this.dist = d;
        }
        @Override
        public int compareTo(Node o){
            return this.dist - o.dist;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        edge = new ArrayList<>();
        for(int i=0; i<=n; i++){
            edge.add(new ArrayList<Node>());
        }

        for(int i=0; i<m; i++){
            in = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(in.nextToken());
            int d = Integer.parseInt(in.nextToken());
            int w = Integer.parseInt(in.nextToken());
            edge.get(s).add(new Node(d, w));
        }

        in = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(in.nextToken());
        int end = Integer.parseInt(in.nextToken());

        int[] dist = new int[n+1];
        Arrays.fill(dist, INF);

        PriorityQueue<Node> que = new PriorityQueue<>();
        que.add(new Node(start,0));
        dist[start] = 0;

        boolean[] visit = new boolean[n+1];

        while(!que.isEmpty()){
            Node node = que.poll();
            if(!visit[node.n]) {
                visit[node.n] = true;
                for (Node get : edge.get(node.n)) {
                    if (!visit[get.n]) {
                        dist[get.n] = Math.min(dist[get.n], dist[node.n] + get.dist);
                        que.add(new Node(get.n, dist[get.n]));
                    }
                }
            }
        }
        System.out.println(dist[end]);
    }
}
