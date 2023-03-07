package Y2023.March.week2;

import java.util.Scanner;


public class q2750 {
    /*퀵정렬 메소드
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
     */
    //병합 정렬 메소드
    static int[] sorted;
    static void merge(int[] sort, int start, int mid, int end){
        int[] arr = sort.clone();
        int i = start;
        int j = mid+1;
        int k = start;
        while(k<=end){
            if(i>mid){
                sorted[k] = arr[j++];
            }else if(j>end){
                sorted[k] = arr[i++];
            }else if(arr[i]<arr[j]){
                sorted[k] = arr[i++];
            }else{
                sorted[k] = arr[j++];
            }
            k++;
        }
    }
    static void mergeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int len = sc.nextInt();
        sorted = new int[len];
        for(int i=0; i<len; i++){
            sorted[i] = sc.nextInt();
        }
        mergeSort(sorted, 0, len-1);
        for(int i=0; i<len; i++){
            sb.append(sorted[i]).append("\n");
        }
        System.out.println(sb);
        //병합 정렬


        //선택정렬
        /*
        int ind, min, tmp;
        for(int i=0; i<len; i++){
            System.out.println(i +" = "+arr[i]);
            ind = i;
            min = arr[i];
            for(int j=i; j<len; j++){
                if(min > arr[j]){
                    ind = j;
                    min = arr[j];
                    System.out.println("min = "+arr[j]);
                }
            }
            tmp = arr[i];
            arr[i] = arr[ind];
            arr[ind] = tmp;
        }

        //버블 정렬
        int tmp;
        for(int i=1; i<len; i++){
            for(int j=0; j<len-i; j++){
                if(arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        //삽입 정렬
        int tmp;
        for(int i=0; i<len; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }else{
                    break;
                }
            }
        }

        //퀵 정렬
        quick(arr, 0, len-1);
        for(int i=0; i<len; i++){
            sb.append(arr[i]+"\n");
        }
        System.out.println(sb);*/
    }
}
