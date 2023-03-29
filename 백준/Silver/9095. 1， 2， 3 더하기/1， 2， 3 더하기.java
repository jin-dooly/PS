import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int cnt = 0;
    public static void dp(int n){

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        for(int i=0; i<len; i++){
            int n = Integer.parseInt(br.readLine());
            if(n==1){
                sb.append(1).append('\n');
                continue;
            }
            int[] arr = new int[n+1];
            Arrays.fill(arr, 1);
            arr[2] = 2;
            for(int j=3; j<=n; j++){
                arr[j] = arr[j-1]+arr[j-2]+arr[j-3];
            }
            sb.append(arr[n]).append('\n');
        }
        System.out.println(sb);
    }
}
