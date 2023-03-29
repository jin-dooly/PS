import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=n,i=0;
        do{
            v=((v%10)*10+(v/10+v%10)%10);
            i++;
        }while(v!=n);
        System.out.print(i);
    }
}