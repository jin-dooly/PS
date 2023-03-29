import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int v= sc.nextInt();
        int i=0;
        if(v%4==0){
            i=1;
            if(v%100==0&&v%400!=0){
                i=0;
            }
        }
        System.out.print(i);
    }
}