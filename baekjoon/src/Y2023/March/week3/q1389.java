package Y2023.March.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1389 {
    static final int MAX = 500001;
    static int n,m;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        for(int i=0; i<n; i++){
            map[i] = new int[n];
            Arrays.fill(map[i], MAX);
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a-1][b-1] = 1;
            map[b-1][a-1] = 1;
        }

        for(int i=0; i<n; i++){
            map[i][i] = 0;
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    map[j][k] = Math.min(map[j][k], map[j][i]+map[i][k]);
                }
            }
        }
        int min = MAX;
        int minIdx = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            System.out.println("----"+i+"----");
            for(int j=0; j<n; j++){
                if(map[i][j]!=MAX){
                    sum += map[i][j];
                    System.out.println("sum "+map[i][j]+" = "+sum);
                }
            }
            if(min > sum){
                min = sum;
                minIdx = i;
                System.out.println("min : "+minIdx);
            }
        }
        System.out.println(minIdx+1);
    }
}
