package Y2023.March.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q2150_Tarjan {
    static int v;
    static int e;
    static int id=0;
    static int[] ID;
    static boolean[] visit;
    static boolean[] finish;
    static ArrayList<ArrayList<Integer>> list;
    static ArrayList<ArrayList<Integer>> scc;
    static Stack<Integer> s;
    static StringBuilder sb = new StringBuilder();

    static int dfs(int x){
        s.add(x);
        visit[x] = true;

        ID[x] = ++id;
        int parent = ID[x];
        for(int y : list.get(x)){
            if(!visit[y]) parent = Math.min(dfs(y),parent);
            else if(!finish[y]){
                parent = Math.min(ID[y],parent);
            }
        }
        if(parent == ID[x]){
            scc.add(new ArrayList<>());
            int out;
            do {
                out = s.pop();
                scc.get(scc.size() - 1).add(out);
                finish[out] = true;
            }while(out != x);
            Collections.sort(scc.get(scc.size() - 1));
        }
        return parent;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();
        scc = new ArrayList<>();
        for(int i=0; i<=v; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
        }

        ID = new int[v+1];
        visit = new boolean[v+1];
        finish = new boolean[v+1];
        s = new Stack<>();

        for(int i=1; i<=v; i++){
            if(visit[i]) continue;
            dfs(i);
        }

        sb.append(scc.size()).append('\n');
        Collections.sort(scc, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });
        for(ArrayList<Integer> scc : scc){
            for(int i : scc){
                sb.append(i).append(' ');
            }
            sb.append(-1).append('\n');
        }

        System.out.println(sb);
    }
}
