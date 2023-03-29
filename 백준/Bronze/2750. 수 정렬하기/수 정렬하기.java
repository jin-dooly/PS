import java.util.Scanner;

public class Main {
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
    }
}