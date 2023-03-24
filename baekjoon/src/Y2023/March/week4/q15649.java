package Y2023.March.week4;

import java.util.ArrayList;
import java.util.Scanner;

public class q15649 {
    static int N,M,len=0;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> list = new ArrayList<>();
    static void DFS(int n){
        if(len>=M) {
            for(int i=0; i<list.size(); i++){
                sb.append(list.get(i)).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i=1; i<=N; i++){
            if(visit[i]) continue;
            list.add(i);
            visit[i] = true;
            len++;
            DFS(i);
            list.remove(list.size()-1);
            visit[i] = false;
            len--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visit = new boolean[N+1];
        if(M==1){
            for(int i=1; i<=N; i++){
                sb.append(i).append('\n');
            }
            System.out.println(sb);
            return;
        }
        DFS(1);
        System.out.println(sb);
    }
}
