package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class q1012 {
    static int[][] map;
    static boolean[][] check;
    static int n,m,k;
    public static void dfs(int x, int y) {
        if(!check[x][y]) {
            check[x][y] =true;
            if (x > 0 && map[x - 1][y] == 1) dfs(x - 1, y);
            if (y > 0 && map[x][y - 1] == 1) dfs(x, y - 1);
            if (x < n - 1 && map[x + 1][y] == 1) dfs(x + 1, y);
            if (y < m - 1 && map[x][y + 1] == 1) dfs(x, y + 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());
        for(int testCnt = 0; testCnt<test; testCnt++) {
            String[] input = br.readLine().split(" ");
            n = Integer.parseInt(input[1]);
            m = Integer.parseInt(input[0]);
            k = Integer.parseInt(input[2]);
            map = new int[n][m];
            check = new boolean[n][m];
            for (int i = 0; i < k; i++) {
                input = br.readLine().split(" ");
                map[Integer.parseInt(input[1])][Integer.parseInt(input[0])] = 1;
            }
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!check[i][j] && map[i][j] == 1) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append('\n');

        }
        System.out.println(sb);
    }
}
