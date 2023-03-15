package Y2023.March.week3;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q2150_Kosaraju {
    static int v;
    static int e;
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> list;
    static ArrayList<ArrayList<Integer>> desc;
    static ArrayList<ArrayList<Integer>> scc;
    static Stack<Integer> s;
    static StringBuilder sb = new StringBuilder();

    static void listDfs(int x){
        if(visit[x]) return;
        visit[x] = true;
        for(int y : list.get(x)){
            listDfs(y);
        }
        s.add(x);
    }
    static void descDfs(int x){
        if(visit[x]) return;
        visit[x] = true;
        for(int y : desc.get(x)){
            descDfs(y);
        }
        scc.get(scc.size()-1).add(x);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();
        desc = new ArrayList<>();
        scc = new ArrayList<>();
        for(int i=0; i<=v; i++){
            list.add(new ArrayList<>());
            desc.add(new ArrayList<>());
        }

        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            desc.get(b).add(a);
        }

        visit = new boolean[v+1];
        s = new Stack<>();

        for(int i=1; i<=v; i++){
            listDfs(i);
        }

        visit = new boolean[v+1];
        while(!s.isEmpty()){
            if(visit[s.peek()]){
                s.pop();
                continue;
            }
            scc.add(new ArrayList<>());
            descDfs(s.peek());
            Collections.sort(scc.get(scc.size()-1));
        }

        Collections.sort(scc, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });

        sb.append(scc.size()).append('\n');
        for(ArrayList<Integer> scc : scc){
            for(int i : scc){
                sb.append(i).append(' ');
            }
            sb.append(-1).append('\n');
        }
        System.out.println(sb);
    }
}
