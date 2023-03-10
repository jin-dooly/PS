package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


/*



미해결(크루스칼 알고리즘 TLE)




 */
class Graph{
    int n1, n2, c;
    boolean check = false;
    public Graph(int n1, int n2, int c){
        this.n1 = n1;
        this.n2 = n2;
        this.c = c;
    }
}
public class q1396 {
    static int n, m, c, v;
    public static void kruskal(Graph[] gps, int x, int y){
        v++;
        if(x == y) return;
        for(int i=0; i<m; i++){
            if(!gps[i].check){
                if(gps[i].n1 == x){
                    c = Math.max(gps[i].c, c);
                    gps[i].check = true;
                    kruskal(gps, gps[i].n2, y);
                }else if(gps[i].n2 == x){
                    c = Math.max(gps[i].c, c);
                    gps[i].check = true;
                    kruskal(gps, gps[i].n1, y);
                }
            }
        }
    }
    public static Graph[] copyGraph(Graph[] gps){
        Graph[] copy = new Graph[gps.length];
        for(int i=0; i< gps.length; i++){
            copy[i] = new Graph(gps[i].n1, gps[i].n2, gps[i].c);
        }
        return copy;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] in = br.readLine().split(" ");
        n = Integer.parseInt(in[0]);
        m = Integer.parseInt(in[1]);
        Graph[] gps = new Graph[m];
        for(int i=0; i<m; i++){
            in = br.readLine().split(" ");
            gps[i] = new Graph(Integer.parseInt(in[0]),Integer.parseInt(in[1]),Integer.parseInt(in[2]));
        }
        Arrays.sort(gps, new Comparator<Graph>() {
            @Override
            public int compare(Graph o1, Graph o2) {
                return o1.c - o2.c;
            }
        });
        int q = Integer.parseInt(br.readLine());
        for(int i=0; i<q; i++) {
            in = br.readLine().split(" ");
            int x = Integer.parseInt(in[0]);
            int y = Integer.parseInt(in[1]);
            c = 0;
            v = 0;
            kruskal(copyGraph(gps), x, y);
            sb.append(c).append(' ').append(v).append('\n');
        }
        System.out.println(sb);
    }
}
