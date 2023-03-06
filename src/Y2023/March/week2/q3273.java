package Y2023.March.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class q3273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int len = sc.nextInt();
        int cnt=0;
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            int n = sc.nextInt();
            set.add(n);
            arr[i] = n;
        }
        int x = sc.nextInt();
        Arrays.sort(arr);
        for(int i=0; i<len && arr[i]<x/2.0; i++){
            if(set.contains(x-arr[i])){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
