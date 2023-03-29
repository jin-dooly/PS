import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int n, cnt = 0;
    static char[][] house;
    static boolean[][] check;
    public static void dfs(int x, int y) {
        if(!check[x][y]) {
            check[x][y] =true;
            cnt++;
            if (x > 0 && house[x - 1][y] == '1') dfs(x - 1, y);
            if (y > 0 && house[x][y - 1] == '1') dfs(x, y - 1);
            if (x < n - 1 && house[x + 1][y] == '1') dfs(x + 1, y);
            if (y < n - 1 && house[x][y + 1] == '1') dfs(x, y + 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        house = new char[n][n];
        check = new boolean[n][n];
        for(int i=0; i<n; i++){
            house[i] = br.readLine().toCharArray();
        }
        int town = 0;
        ArrayList<Integer> houseCount = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!check[i][j] && house[i][j] == '1'){
                    dfs(i,j);
                    houseCount.add(cnt);
                    cnt = 0;
                    town++;
                }
            }
        }
        Collections.sort(houseCount);
        sb.append(town).append('\n');
        for(int i=0; i<houseCount.size(); i++){
            sb.append(houseCount.get(i)).append('\n');
        }
        System.out.println(sb);
    }
}