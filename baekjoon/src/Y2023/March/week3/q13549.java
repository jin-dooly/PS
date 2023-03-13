package Y2023.March.week3;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class q13549 {
    static final int MAX_POSITION = 100000;
    static final int INF = 100000;
    static int n,k, max;
    static int[] time = new int[MAX_POSITION+1];
    static PriorityQueue<Node> pq = new PriorityQueue<Node>();

    static class Node implements Comparable<Node>{
        int position;
        int time;
        public Node(int p, int t){
            position = p;
            time = t;
        }
        @Override
        public int compareTo(Node o) {
            return time - o.time;
        }
    }

    static void dijkstra(){
        Arrays.fill(time, INF);
        time[n] = 0;
        pq.add(new Node(n,0));

        while(!pq.isEmpty()){
            Node current = pq.poll();

            if(time[current.position] < current.time) continue;
            if(current.position > max) continue;

            int next1 = current.position-1;
            if(isValid(next1) && time[next1] > current.time+1){
                time[next1] = current.time+1;
                pq.add(new Node(next1, time[next1]));
            }

            int next2 = current.position+1;
            if(isValid(next2) && time[next2] > current.time+1){
                time[next2] = current.time+1;
                pq.add(new Node(next2, time[next2]));
            }

            int next3 = current.position*2;
            if(isValid(next3) && time[next3] > current.time){
                time[next3] = current.time;
                pq.add(new Node(next3, time[next3]));
            }
        }
    }
    static boolean isValid(int p){
        return 0 <= p && p <=MAX_POSITION;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        max = k+(k-n);
        if(n>k) System.out.println(n-k);
        else {
            dijkstra();
            System.out.println(time[k]);
        }
    }
}
