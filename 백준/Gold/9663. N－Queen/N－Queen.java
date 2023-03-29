import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N, cnt=0;
    static int[] queen;
    static void backtrack(int i){
        if(i==N){
            cnt++;
            return;
        }
        for(int j=0; j<N; j++){
            if(possible(i, j)) {
                queen[i] = j;
                backtrack(i + 1);
                queen[i] = 100;
            }
        }
    }
    static boolean possible(int i, int j){
        for(int k=0; k<i; k++){
            if(queen[k] == j || i-k == (Math.abs(j-queen[k]))) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        queen = new int[N];
        Arrays.fill(queen, 100);
        backtrack(0);
        System.out.println(cnt);
    }
}
