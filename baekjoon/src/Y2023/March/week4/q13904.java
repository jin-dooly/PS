package Y2023.March.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class q13904 {
    static class Table implements Comparable<Table> {
        int d;
        int w;
        public Table(int d, int w){
            this.d = d;
            this.w = w;
        }
        @Override
        public int compareTo(Table o) {
            if(d == o.d) return o.w-w;
            return o.d - d;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Table> pq = new PriorityQueue<>();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            pq.add(new Table(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        int max = 0, score = 0;
        for(int i=pq.peek().d; !pq.isEmpty() && i>0; i--){
            if(pq.peek().d < i) continue;
            if(pq.peek().d == i){
                score += pq.poll().w;
            }
            while(!pq.isEmpty() && pq.peek().d == i){
                pq.add(new Table(i-1, pq.poll().w));
            }
        }
        System.out.println(score);
    }
}
