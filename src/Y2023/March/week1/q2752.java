package Y2023.March.week1;

import java.util.Scanner;

public class q2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        for(int i=0; i<3; i++){
            num[i] = sc.nextInt();
        }
        int temp;
        for(int i=0; i<2; i++){
            for(int j=i; j<3; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println(num[0]+" "+num[1]+" "+num[2]);
    }
}
