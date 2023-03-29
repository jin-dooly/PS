import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;
    static Integer[] dp;
    public static int find(int i){
        if(dp[i] == null)
            dp[i] = Math.max(find(i-2),find(i-3)+arr[i-1])+arr[i];
        return dp[i];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        dp = new Integer[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 0;
        dp[1] = arr[1];
        if(n>1) dp[2] = arr[1] +arr[2];
        System.out.println(find(n));
    }
}
