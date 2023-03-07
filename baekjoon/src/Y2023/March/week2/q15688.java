package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class q15688 {

    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        int[][] arr = new int[2][1000001];
        Arrays.fill(arr[0],0);
        Arrays.fill(arr[1],0);
        int in;
        for (int i = 0; i < len; i++) {
            in = Integer.parseInt(br.readLine());
            if(in<0)
                arr[0][-in]++;
            else
                arr[1][in]++;
        }
        for (int i = 1000000; i >0 ; i--) {
            if(arr[0][i]!=0)
                for(int j=0; j<arr[0][i]; j++){
                    sb.append(-i).append("\n");
                }
        }
        for (int i = 0; i < 1000001; i++) {
            if(arr[1][i]!=0)
                for(int j=0; j<arr[1][i]; j++){
                    sb.append(i).append("\n");
                }
        }
        System.out.println(sb);
    }
}
