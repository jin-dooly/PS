import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static char[][] arr;
    static void star(int x, int y, int k){
        if(k==1) {
            arr[y][x] = '*';
            return;
        }
        k = k/3;
        star(x, y, k);
        star(x+k, y, k);
        star(x+k+k, y, k);

        star(x, y+k, k);
        star(x+k+k, y+k, k);

        star(x, y+k+k, k);
        star(x+k, y+k+k, k);
        star(x+k+k, y+k+k, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        n = sc.nextInt();
        arr = new char[n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(arr[i], ' ');
        }
        star(0, 0, n);
        for(char[] ch : arr){
            for(char c : ch){
                sb.append(c);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
