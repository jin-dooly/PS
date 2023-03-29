import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] cnt;
    static int[][] arr;
    static int split(int x, int y, int n){
        int comp = arr[x][y];
        if(n < 3) return comp;
        n/=3;
        boolean key = true;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(comp != split(x+(n*j), y+(n*i), n)){
                    key = false;
                }
            }
        }
        if(key) {
            cnt[comp+1]-=8;
            return comp;
        }
        else return 999;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        cnt = new int[]{0, 0, 0};
        arr = new int[n][n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; st.hasMoreTokens(); j++){
                int tmp = Integer.parseInt(st.nextToken());
                arr[i][j] = tmp;
                cnt[tmp+1]++;
            }
        }

        split(0, 0, n);
        for(int i=0; i<3; i++){
            System.out.println(cnt[i]);
        }
    }
}
