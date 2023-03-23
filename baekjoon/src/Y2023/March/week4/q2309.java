package Y2023.March.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q2309 {
    static int[] height = new int[9];
    static int rest;
    static void search(){
        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if(height[i]+height[j] == rest){
                    height[i] = height[j] = 0;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sum = 0;

        for(int i=0; i<9; i++){
            height[i] = Integer.parseInt(br.readLine());
            sum+=height[i];
        }

        rest = sum - 100;
        search();
        Arrays.sort(height);
        for(int i : height)
            if(i!=0) sb.append(i).append('\n');
        System.out.println(sb);
    }
}
