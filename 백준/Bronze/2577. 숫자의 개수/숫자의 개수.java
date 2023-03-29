import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int val=a*b*c;
        int[] arr= new int[10];
        while(val/10!=0||val%10!=0){
            arr[val%10]++;
            val/=10;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}