import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, a, b;
    static int[] arr, minTree, maxTree;

    static int init_min(int segStart, int segEnd, int nodeInx){
        if(segStart == segEnd) return minTree[nodeInx] = arr[segStart];
        int mid = (segStart + segEnd)/2;
        return minTree[nodeInx] = Math.min(init_min(segStart, mid, nodeInx*2), init_min(mid+1, segEnd, nodeInx*2+1));
    }
    static int init_max(int segStart, int segEnd, int nodeInx){
        if(segStart == segEnd) return maxTree[nodeInx] = arr[segStart];
        int mid = (segStart + segEnd)/2;
        return maxTree[nodeInx] = Math.max(init_max(segStart, mid, nodeInx*2), init_max(mid+1, segEnd, nodeInx*2+1));
    }

    static int findMax(int segStart, int segEnd, int nodeInx){
        if(segStart>b || segEnd<a) return 0;
        if(segStart>=a && segEnd<=b) return maxTree[nodeInx];
        int mid = (segStart + segEnd)/2;
        return Math.max(findMax(segStart, mid, nodeInx*2), findMax(mid+1, segEnd, nodeInx*2+1));
    }
    static int findMin(int segStart, int segEnd, int nodeInx){
        if(segStart>b || segEnd<a) return Integer.MAX_VALUE;
        if(segStart>=a && segEnd<=b) return minTree[nodeInx];
        int mid = (segStart + segEnd)/2;
        return Math.min(findMin(segStart, mid, nodeInx*2), findMin(mid+1, segEnd, nodeInx*2+1));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1];
        minTree = new int[N*4];
        maxTree = new int[N*4];

        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        init_min(1, N, 1);
        init_max(1, N, 1);

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append(findMin(1, N, 1)).append(' ');
            sb.append(findMax(1, N, 1)).append(' ');
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
