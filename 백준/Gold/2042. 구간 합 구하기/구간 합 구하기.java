import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, K, b, c;
    static long[] arr, tree;

    static long sgmt(int start, int end, int node){
        if(start == end) return tree[node] = arr[start];
        int mid = (start+end)/2;
        return tree[node] = sgmt(start, mid, node*2) + sgmt(mid+1, end, node*2+1);
    }
    static long update(int start, int end, int node){
        if(start == end) return tree[node] = arr[b];
        int mid = (start+end)/2;
        if(mid >= b) return tree[node] = update(start, mid, node*2) + tree[node*2+1];
        else return tree[node] = tree[node*2] + update(mid+1, end, node*2+1);
    }
    static long sum(int start, int end, int node){
        if(start>c || end<b) return 0;
        if(start>=b && end<=c) return tree[node];
        int mid = (start+end)/2;
        return sum(start, mid, node*2) + sum(mid+1, end, node*2+1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new long[N+1];
        tree = new long[N*4];

        for(int i=1; i<=N; i++){
            arr[i] = Long.parseLong(br.readLine());
        }
        sgmt(1, N, 1);

        for(int i=0; i<M+K; i++){
            st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals("1")){
                b = Integer.parseInt(st.nextToken());
                arr[b] = Long.parseLong(st.nextToken());
                update(1, N, 1);
            }else{
                b = Integer.parseInt(st.nextToken());
                c = Integer.parseInt(st.nextToken());
                sb.append(sum(1, N, 1)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
