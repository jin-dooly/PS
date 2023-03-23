package Y2023.March.week4;

import java.util.Scanner;

public class q2231 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum;
        for(int m=1; m<n; m++){
            sum=m;
            //문자열로 만든 다음 잘라서 더하기
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
