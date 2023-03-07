package Y2023.March.week2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> list = new LinkedList<>();
        for(int i=1; i<=n; i++){
            list.add(i);
        }
        sb.append('<');
        while(true){
            for(int i=0; i<k-1; i++){
                list.offer(list.poll());
            }
            sb.append(list.poll());
            if(list.isEmpty())
                break;
            sb.append(", ");
        }
        sb.append('>');
        System.out.println(sb);
        /*
        int[] man = new int[n+1];
        for(int i=1; i<=n; i++){
            man[i] = i;
        }
        int out;
        int cnt = 0;
        sb.append('<');
        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                do {
                    cnt++;
                    if(cnt>7) cnt -= 7;
                }while(man[cnt]==0);
            }
            sb.append(cnt);
            if(i!=n-1) sb.append(", ");
            man[cnt] = 0;
        }
        sb.append('>');
        System.out.println(sb);

         */
    }
}
