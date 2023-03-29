import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum;
        for(int m=1; m<n; m++){
            sum=m;
            String[] str = (m+"").split("");
            for(String ch : str){
                sum += Integer.parseInt(ch);
            }
            if(sum == n){
                System.out.println(m);
                return;
            }
        }
        System.out.println(0);
    }
}
