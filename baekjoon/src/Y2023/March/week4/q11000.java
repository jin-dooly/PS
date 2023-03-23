package Y2023.March.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] list = new int[n][2];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        PriorityQueue<Integer> T = new PriorityQueue<>();
        T.add(0);
        for(int[] time : list){
            if(T.peek() <= time[0]) {
                T.poll();
            }
            T.add(time[1]);
        }
        System.out.println(T.size());
    }
}
