package Y2023.March.week2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class q13300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        float k = sc.nextFloat();
        int[][] cnt = new int[2][6];
        int ans = 0;
        Arrays.fill(cnt[0],0);
        Arrays.fill(cnt[1],0);
        for(int i=0; i<len; i++){
            cnt[sc.nextInt()][sc.nextInt()-1]++;
        }
        for(int i=0; i<6; i++){
            ans += Math.ceil(cnt[0][i]/k);
            ans += Math.ceil(cnt[1][i]/k);
        }
        System.out.println(ans);
    }
}
