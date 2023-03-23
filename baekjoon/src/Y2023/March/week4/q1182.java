package Y2023.March.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1182 {
    static int[] arr;
    static int n, s, ans=0;
    static void search(int i, int sum){
        if(i==n) {
            if(sum == s) ans++;
            return;
        }
        search(i+1, sum+arr[i]);
        search(i+1, sum);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        search(0,0);
        if(s==0) ans--;
        System.out.println(ans);
    }
}
