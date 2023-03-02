package Y2023.March.week1;

import java.util.Scanner;

public class q2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        int min = 100;

        for(int i=0; i<7; i++){
            if((n=sc.nextInt())%2 == 1){
                sum += n;
                if(min>n)
                    min = n;
            }
        }
        if(sum==0)
            System.out.println("-1");
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
