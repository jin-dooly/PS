import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static final long MAX = 10000000000L;
    static int n, m;
    static ArrayList<ArrayList<Node>> list = new ArrayList<>();
    static long[][] result = new long[n][n];
    static class Node implements Comparable<Node>{
        int num;
        long c;
        public Node(int b, long c){
            this.num=b;
            this.c=c;
        }

        @Override
        public int compareTo(Node o) {
            return (int)(c - o.c);
        }
    }

    static void floyd(){
        for(int i=0; i<n; i++){
            result[i][i] = 0;
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    result[j][k] = Math.min(result[j][k], result[j][i]+result[i][k]);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        result = new long[n][n];
        for(int i=0; i<n; i++){
            result[i] = new long[n];
            Arrays.fill(result[i], MAX);
        }

        StringTokenizer st;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            result[a-1][b-1] = Math.min(result[a-1][b-1], c);
        }
        
        floyd();

        StringBuilder sb = new StringBuilder();
        for(long[] a : result){
            for(long b : a){
                if(b == MAX) sb.append(0).append(' ');
                else sb.append(b).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
