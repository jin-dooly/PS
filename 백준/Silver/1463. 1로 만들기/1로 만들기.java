import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n+1];
        Arrays.fill(arr, 1000001);
        arr[1] = 0;
        for(int i=1; i<n; i++){
            arr[i+1] = Math.min(arr[i+1],arr[i]+1);
            if(i*2 <= n) arr[i*2] = Math.min(arr[i*2],arr[i]+1);
            if(i*3 <= n) arr[i*3] = Math.min(arr[i*3],arr[i]+1);
        }
        System.out.println(arr[n]);
    }
}
