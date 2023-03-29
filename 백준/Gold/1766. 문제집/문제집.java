import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new ArrayList<>());
        }
        int[] inDegree = new int[n];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a-1).add(b-1);
            inDegree[b-1]++;
        }

        for(int i=0; i<n; i++){
            if(inDegree[i]==0) pq.add(i);
        }
        while(!pq.isEmpty()){
            int a = pq.poll();
            sb.append(a+1).append(' ');
            for(int b : list.get(a)){
                inDegree[b]--;
                if(inDegree[b]==0) pq.add(b);
            }
        }
        System.out.println(sb);
    }
}
