import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k = sc.nextInt();
        int[][] cnt = new int[2][6];
        int ans = 0;
        Arrays.fill(cnt[0],0);
        Arrays.fill(cnt[1],0);
        for(int i=0; i<len; i++){
            cnt[sc.nextInt()][sc.nextInt()-1]++;
        }
        for(int i=0; i<6; i++){
            ans += (cnt[0][i]+1)/2;
            ans += (cnt[1][i]+1)/2;
        }
        System.out.println(ans);
    }
}