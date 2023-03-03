package Y2023.March.week1;

import java.util.Arrays;
import java.util.Scanner;

public class q1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[9];
        Arrays.fill(cnt, 0);
        int max = 0;
        char[] numbers = sc.next().toCharArray();
        for(int i=0; i<numbers.length; i++){
            int ind = numbers[i]-'0';

            if(ind==9)
                ind = 6;
            cnt[ind]++;

            if(ind == 6){
                if(max< (cnt[6]+1)/2)
                    max = ((cnt[6] + 1) / 2);
            } else if(max < cnt[ind]){
                max = cnt[ind];
            }
        }
        System.out.println(max);
    }
}
