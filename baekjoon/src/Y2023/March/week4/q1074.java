package Y2023.March.week4;

import java.util.Scanner;

public class q1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int) Math.pow(2, sc.nextInt());
        int r = sc.nextInt();
        int c = sc.nextInt();

        int x=0, y=0, cnt=0;
        while(n>1){
            n/=2;
            if(r>=y+n){
                cnt += 2*n*n;
                y+=n;
            }
            if(c>=x+n){
                cnt += n*n;
                x+=n;
            }
        }
        System.out.println(cnt);
    }
}
