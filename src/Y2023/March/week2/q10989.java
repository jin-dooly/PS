package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        Arrays.fill(arr, 0);

        for(int i=0; i<len; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }
        int cnt=0;
        for(int i=1; cnt<len && i<10001; i++){
            if(arr[i] != 0){
                for(int j=0; j<arr[i]; j++){
                    sb.append(i+"\n");
                    cnt++;
                }
            }
        }
        System.out.println(sb);
    }
}
