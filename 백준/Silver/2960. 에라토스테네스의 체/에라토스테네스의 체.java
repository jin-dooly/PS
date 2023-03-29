import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] N = new boolean[n+1];
        for(int i=2; i<=n; i++){
            for(int j=i; j<=n; j+=i){
                if(!N[j]){
                    k--;
                    if(k == 0) {
                        System.out.println(j);
                        return;
                    }
                    N[j] = true;
                }
            }
        }
    }
}
