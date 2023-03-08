package Y2023.March.week2;

import java.util.*;

public class q2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();
        for(int i=1; i<=N; i++){
            que.offer(i);
        }
        while(que.size()>1){
            que.poll();
            que.offer(que.poll());
        }
        System.out.println(que.poll());
    }
}
