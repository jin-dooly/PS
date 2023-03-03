package Y2023.March.week1;

import java.util.Scanner;

public class q10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        int cnt=0;
        int v = sc.nextInt();
        for(int i : arr){
            if(i==v)
                cnt++;
        }
        System.out.println(cnt);
    }
}
