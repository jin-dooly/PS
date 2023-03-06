package Y2023.March.week2;

import java.util.Arrays;
import java.util.Scanner;

public class q2751 {
    //퀵 정렬
    public static void quick(int[] arr, int start, int end){
        if(start >= end )
            return;
        int tmp;
        int key = start;
        int i = start+1;//큰값 찾기
        int j = end; //작은 값 찾기
        while(i <= j){ //엇갈리면 나가기
            while(i<=end && arr[i]<arr[key]){
                i++;
            }
            while(j>start && arr[j]>arr[key]){
                j--;
            }
            if(i < j){ //엇갈리지 않음
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }else { //엇갈림
                tmp = arr[j];
                arr[j] = arr[key];
                arr[key] = tmp;
            }
        }

        quick(arr, start, j-1);
        quick(arr, j+1, end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        //quick(arr, 0, len-1);
        for(int i=0; i<len; i++){
            sb.append(arr[i]+"\n");
        }
        System.out.println(sb);
    }
}