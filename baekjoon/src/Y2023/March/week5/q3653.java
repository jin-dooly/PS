package Y2023.March.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q3653 {
    static int N, M, mpos, top, cpos, val;
    static int[] pos, tree;

    static int init(int start, int end, int idx){
        if(start == end){
            if(end <= N) return tree[idx] = 1;
            else return tree[idx] = 0;
        }
        int mid = (start + end)/2;
        return tree[idx] = init(start,mid,idx*2) + init(mid+1, end, idx*2+1);
    }
    static int update(int start, int end, int idx){
        if(start == end) return tree[idx] = val;
        int mid = (start+end)/2;
        if(mid<cpos) return tree[idx] = update(mid+1, end, idx*2+1)+tree[idx*2];
        else return tree[idx] = update(start, mid, idx*2)+tree[idx*2+1];
    }
    static int sum(int start, int end, int idx){
        if(start>top || end<mpos) return 0;
        if(start>=mpos && end<=top) return tree[idx];
        int mid = (start+end)/2;
        if(mid<mpos) return sum(mid+1, end, idx*2+1);
        else return sum(start, mid, idx*2)+tree[idx*2+1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());
        for(int t=0; t<test; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            pos = new int[N+1];
            tree = new int[(N+M)*4];
            top = N+M;
            for(int i=1, n=N; i<=N; i++, n--){
                pos[i] = n;
            }
            init(1, top, 1);

            st = new StringTokenizer(br.readLine());
            for(int i=1; i<=M; i++){
                int movie = Integer.parseInt(st.nextToken());
                mpos = pos[movie]+1;
                sb.append(sum(1, top, 1)).append(' ');

                cpos = pos[movie];
                val = 0;
                update(1,top,1);

                cpos = pos[movie] = N+i;
                val = 1;
                update(1, top, 1);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
